package com.iris.egrant.oracle2mysql;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import oracle.xdb.XMLType;

/**
 *    转换工具类
 * @author cg
 *
 */
public class Transfer  {
	
	/**
	 * 字段分隔符
	 */
	private static final String FIELDS_TERMINATOR = "\tbycg" ;
	
	/**
	 * 记录分隔符
	 */
	private static final String LINES_TERMINATOR = "\nbycg" ;
	
	
	/**
	 * mysql 导入sql
	 * 关于 LOAD DATA LOCAL INFILE 的使用 请阅读
	 * https://dev.mysql.com/doc/refman/5.7/en/load-data.html
	 */
	private static final String mysqlImportSql = 
			"LOAD DATA LOCAL INFILE 'sql.csv' INTO TABLE  %s"  // 
			   + " character set utf8 " // 必须指定 character set
			   +  " FIELDS TERMINATED BY '" + FIELDS_TERMINATOR + "' "   // 字段分隔符号
			   +  " LINES  TERMINATED BY '" + LINES_TERMINATOR + "' ";  ;


	/**
	 *   逐表从oracle读取数据 逐条插入mysql对应表（前提是mysql已有对应表）
	 *   不包括 CLOB 和BCLOB
	 * @param startTableName 从哪个表开始导入
	 * @param flag 起始位置标示 :flag >=0, 从 >= startTableName 开始导（按字符串自然排序的升序）；flag < 0, 从 <  startTableName 开始导（按字符串自然排序的升序）
	 * @param targetDbName 目标库
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public void doImportByTable(String startTableName, Integer flag, String targetDbName) throws ClassNotFoundException, IOException, SQLException {
		 
		Connection mysqlConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_MYSQL); 
		mysqlConnection.setAutoCommit(false) ;
		
		Connection oracleConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_ORACLE); 
		// oracleConnection.setAutoCommit(false);
		 // 取得所有表
		String oracleTablesSql = " select t.TABLE_NAME from  user_tables t   "  
				 + "  where   t.TABLE_NAME in (  'PROPOSAL_CACHED_EXTEND' ,'PROPOSAL_EXTEND') "
		     // + 	"   where t.TABLE_NAME not in ('QRTZ_TASK_DETAIL_LOG','COMPARE_QUEUE','SECURITY_LOG','QRTZ_TASK_LOG','QUEUE_TASK_LOG','FACT_GDSSY')  "
				;
		if (null == flag){
			
		}else	if ( flag.intValue() >= 0){
			oracleTablesSql += " and  t.TABLE_NAME > '" + startTableName.toUpperCase() + "' " ;
		}else if ( flag.intValue() < 0){
			oracleTablesSql += " and  t.TABLE_NAME  < '" + startTableName.toUpperCase() + "' " ;
		}
		oracleTablesSql = oracleTablesSql + " order by t.TABLE_NAME asc  " ;
		// 每次取1000
	  ResultSet rs = this.getResultSet(oracleConnection , oracleTablesSql) ;  
	  // 遍历oracle中每一个表
	  while(rs.next()){ // 
		  long startTime = System.currentTimeMillis() ;
		 String oracleTableName =  rs.getString("TABLE_NAME") ;  //oracle 表名
		 String mysqlTableName =  rs.getString("TABLE_NAME").toLowerCase();  //mysql 表名
		 System.out.print(mysqlTableName + " ");
		 // 查mysql是否存在此表
		 String mysqlSqlStr = " SELECT count(*)  as count  FROM information_schema.TABLES t  where 1=1 and t.TABLE_SCHEMA =  '" + targetDbName + "' and t.TABLE_NAME  =  '"  + mysqlTableName + "'";
		 ResultSet mysqlTabCntRs  = this.getResultSet(mysqlConnection , mysqlSqlStr) ;
		 boolean mysqlExistFlag = false ;
		 if (mysqlTabCntRs.next()){
			 String  cntStr = mysqlTabCntRs.getString("count") ;  // mysql 是否存在此表
			 if ("1".equals(cntStr)){ // 存在 
				 mysqlExistFlag = true ;
			 }else{  //  // 不存在 
				 System.out.println("在mysql不存在！");
			 }
		 }
		  // mysql存在此表 开始导入数据
		 if (mysqlExistFlag){
			    String oracleMetaDataSql = "select * from " +  oracleTableName    /*+  " where  psn_code = 100029995 "*/   ;
			    ResultSet oracleRs = this.getResultSet(oracleConnection ,oracleMetaDataSql) ;
			    ResultSetMetaData rsmd = oracleRs.getMetaData() ;
			    int oracleColumnCount = rsmd.getColumnCount() ;
			    StringBuilder sb = new StringBuilder() ;
			    while(oracleRs.next()){
				    for( int i = 1 ; i <= oracleColumnCount ; i ++ ){  // 遍历 单条记录的每个字段 
				    		rsmd.getColumnLabel(i) ;
				    		Object o = null;
							try {
								o = oracleRs.getObject(i);
							} catch (Exception e) {
								// TODO 自动生成的 catch 块
								//e.printStackTrace();
							}
				    	 //  System.out.println(rsmd.getColumnClassName(i));
				    	 if (1!=1 && o instanceof oracle.xdb.XMLType){
				    		  XMLType tempObj = (XMLType) o ;
				    		  sb.append( tempObj.getStringVal()) ;
				    	 // 	  tempObj.getStream()
				    	 }/*else if (o instanceof oracle.sql.BLOB){
				    		 oracle.sql.BLOB tempObj = (oracle.sql.BLOB)o ;
				    		 String tempStr = new String(tempObj.getBytes(),"UTF-8");
				    		 sb.append(tempStr);
				    	 } */
				    	/* if (o instanceof oracle.sql.CLOB){
				    		  oracle.sql.CLOB tempObj = (oracle.sql.CLOB)o ; 
								  Reader r = tempObj.getCharacterStream() ;
								  StringWriter w = new StringWriter();
							    char[] buff = new char[16*1024] ;
							    int l = 0 ;
							    if ( (l = r.read(buff)) > 0 ) {
							    	w.write(buff, 0, l) ;
							    	}
							    sb.append(w.toString());
				    		 
				    	 }*/
				    	/* else if ( o instanceof java.sql.Timestamp ){ // 
				    		 java.sql.Timestamp tempObj = (java.sql.Timestamp)o ;
				    		 sb.append(tempObj.toString());
				    	 }*/else{
    		          if(null == o){
    		        	    sb.append( "\\N") ;
    		          }else{
    		        	  	String tempStr = o.toString() ;
    		        	  	tempStr =  tempStr.contains("\\") ? tempStr.replace("\\", "/") : tempStr ;
    		        	    sb.append( tempStr  )	;
				    		          }
				    	 	  }
				    	 
				    	// 一条记录结尾添加\n
				    	 if (i == oracleColumnCount ){
				    		  sb.append(LINES_TERMINATOR) ;
				       }else{
				      	  sb.append(FIELDS_TERMINATOR) ;
				      	    }
				       }
			       }
			  byte[] bytes = sb.toString().getBytes("UTF-8");
				InputStream is = new ByteArrayInputStream(bytes);
				String importSql =  String.format(mysqlImportSql, new Object[]{mysqlTableName}) ;
				int cnt = this.bulkLoadFromInputStream4Mysql(mysqlConnection ,importSql, is);
			 
				  mysqlConnection.commit() ;
			
				long endTime = System.currentTimeMillis() ;
				System.out.println(String.format("导入 %s 条记录！耗时%s ms", new Object[]{cnt+"" ,(endTime - startTime) + ""}));  // 打印
			
		 }
	  }
	}
	
	/**
	 * xmltype 处理
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public void doImportXmlType() throws IOException, SQLException, ClassNotFoundException{
		Connection mysqlConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_MYSQL); 
		mysqlConnection.setAutoCommit(false) ;
		
		Connection oracleConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_ORACLE); 
		oracleConnection.setReadOnly(true);
		// 找到所有包含XMLTYPE 的字段
		String oracleLobTableSql = "select  t.TABLE_NAME as TABLE_NAME ,  " 
														   + " to_char(wm_concat(t.COLUMN_NAME)) as COLUMN_NAMES " 
															 + " from user_tab_columns t "
															 + " where  t.DATA_TYPE in ('XMLTYPE' ) "
														  + " and  t.TABLE_NAME  not in ( 'PROPOSAL_CACHED_EXTEND','PROPOSAL_EXTEND') "   //TODO
															  + " and t.TABLE_NAME > 'REPORT_PROGRESS' "
															 + " group by t.TABLE_NAME "
															 + " order by t.TABLE_NAME asc "; 
		ResultSet oracleLobTableRs = this.getResultSet(oracleConnection, oracleLobTableSql)  ;
		// 从oracle表 逐一导入
		while (oracleLobTableRs.next()){   // 每一个表
			// 需要处理的字段
			String oColumnNames =  oracleLobTableRs.getString("COLUMN_NAMES") ; 
			String[] oColumnNamesArr = oColumnNames.split(",");
			// 表名
			String oTableName =  oracleLobTableRs.getString("TABLE_NAME") ;  
			System.out.print( "表：" + oTableName);
			// 主健字段 或者 唯一健字段  用于匹配数据
			String keyField = this.getKeyField(oracleConnection, oTableName) ;
			String[] keyFieldArr = null ; 
			if ( null != keyField && !"".equals(keyField)){
				keyFieldArr = keyField.split(",");
				System.out.print(" 匹配数据使用主健/唯一健字段：" +  keyField);
			}else{
				System.out.println(" 未找到匹配数据使用主健/唯一健字段！跳过");
				continue ;
			}
			// 开始找数据 
			// oralce  sql
			String oDataSql =  " select "  + keyField + " , " + oColumnNames   +  " from  "  + oTableName  /*+ " where rownum = 1 "*/ ; //TODO
			// oralce ResultSet
			ResultSet oDataRs = this.getResultSet(oracleConnection, oDataSql) ;
			// 准备更 mysql
			// sql
			StringBuilder mysqlSelect4updateSb  = new StringBuilder(" update   " + oTableName.toLowerCase() + " set ");
			 // 拼凑sql 待更新字段 
			for (int i = 0 ; i < oColumnNamesArr.length ; i++ ){
				mysqlSelect4updateSb.append( "`" + oColumnNamesArr[i].toLowerCase() + "` = ? " ) ;
				 // 字段结尾 + ","
				if ( i < oColumnNamesArr.length -1){
					mysqlSelect4updateSb.append( " , ") ;
				}
			}
			// table name 
			mysqlSelect4updateSb.append(  " where  1=1 ") ;
			// where clause
			for (int i = 0 ; i < keyFieldArr.length ; i++ ){
				// 条件之前 评凑 and
				mysqlSelect4updateSb.append( " and `" + keyFieldArr[i].toLowerCase() + "`" + " = ? ") ;
			}
			 
			// PreparedStatement ps = mysqlConnection.prepareStatement(" " );
			PreparedStatement mysqlUpdatePs = mysqlConnection.prepareStatement(mysqlSelect4updateSb.toString());
			System.out.println(" 需处理的XMLTYPE字段：" +  Arrays.toString(oColumnNamesArr));
			while (oDataRs.next()){  // oracle 每一条数据
				 // 处理mysql记录
					// 每一个   BLOB字段
					for (int i = 0 ; i < oColumnNamesArr.length ; i++ ){
						  Object o = null;
						try {
							o = oDataRs.getObject(oColumnNamesArr[i]);
						} catch (Exception e) {
							// TODO 自动生成的 catch 块
							//e.printStackTrace();
						} 
						  XMLType tempObj = (XMLType) o ;
						  mysqlUpdatePs.setString( i + 1 , tempObj == null ? null : tempObj.getStringVal() );
					}
					// 追加 where 条件,使用主健 或者唯一健 做查询条件
					for (int i = 1 ; i <= keyFieldArr.length ; i++ ){ 
						mysqlUpdatePs.setObject(  oColumnNamesArr.length + i, oDataRs.getObject(keyFieldArr[i-1])) ;
					}
					mysqlUpdatePs.addBatch() ;
			}
			 // 执行
			mysqlUpdatePs.executeBatch() ;
			// 提交事物
		  mysqlConnection.commit() ;
		}
		
	}
	
	
	/**
	 * blob 处理
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public void doImportBlob() throws IOException, SQLException, ClassNotFoundException{
		Connection mysqlConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_MYSQL); 
		mysqlConnection.setAutoCommit(false) ;
		
		Connection oracleConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_ORACLE); 
		oracleConnection.setReadOnly(true);
		// 找到所有包含blob 的字段
		String oracleLobTableSql = "select  t.TABLE_NAME as TABLE_NAME ,  " 
														   + " to_char(wm_concat(t.COLUMN_NAME)) as COLUMN_NAMES " 
															 + " from user_tab_columns t "
															 + " where  t.DATA_TYPE in ('BLOB') "
														//    + " and  t.TABLE_NAME = 'QRTZ_JOB_DETAILS' "   //TODO
															 + " group by t.TABLE_NAME "
															 + " order by t.TABLE_NAME asc "; 
		ResultSet oracleLobTableRs = this.getResultSet(oracleConnection, oracleLobTableSql)  ;
		// 从oracle表 逐一导入
		while (oracleLobTableRs.next()){   // 每一个表
			// 需要处理的字段
			String oColumnNames =  oracleLobTableRs.getString("COLUMN_NAMES") ; 
			String[] oColumnNamesArr = oColumnNames.split(",");
			// 表名
			String oTableName =  oracleLobTableRs.getString("TABLE_NAME") ;  
			System.out.print( "表：" + oTableName);
			// 主健字段 或者 唯一健字段  用于匹配数据
			String keyField = this.getKeyField(oracleConnection, oTableName) ;
			String[] keyFieldArr = null ; 
			if ( null != keyField && !"".equals(keyField)){
				keyFieldArr = keyField.split(",");
				System.out.print(" 匹配数据使用主健/唯一健字段：" +  keyField);
			}else{
				System.out.print(" 未找到匹配数据使用主健/唯一健字段！跳过");
				continue ;
			}
			// 开始找数据 
			// oralce  sql
			String oDataSql =  " select "  + keyField + " , " + oColumnNames   +  " from  "  + oTableName  /*+ " where rownum = 1 "*/ ; //TODO
			// oralce ResultSet
			ResultSet oDataRs = this.getResultSet(oracleConnection, oDataSql) ;
			// 准备更 mysql
			// sql
			StringBuilder mysqlSelect4updateSb  = new StringBuilder(" update   " + oTableName.toLowerCase() + " set ");
			 // 拼凑sql 待更新字段 
			for (int i = 0 ; i < oColumnNamesArr.length ; i++ ){
				mysqlSelect4updateSb.append( "`" + oColumnNamesArr[i].toLowerCase() + "` = ? " ) ;
				 // 字段结尾 + ","
				if ( i < oColumnNamesArr.length -1){
					mysqlSelect4updateSb.append( " , ") ;
				}
			}
			// table name 
			mysqlSelect4updateSb.append(  " where  1=1 ") ;
			// where clause
			for (int i = 0 ; i < keyFieldArr.length ; i++ ){
				// 条件之前 评凑 and
				mysqlSelect4updateSb.append( " and `" + keyFieldArr[i].toLowerCase() + "`" + " = ? ") ;
			}
			 
			// PreparedStatement ps = mysqlConnection.prepareStatement(" " );
			PreparedStatement mysqlUpdatePs = mysqlConnection.prepareStatement(mysqlSelect4updateSb.toString());
			System.out.println(" 需处理的BLOB字段：" +  Arrays.toString(oColumnNamesArr));
			while (oDataRs.next()){  // oracle 每一条数据
				 // 处理mysql记录
					// 每一个   BLOB字段
					for (int i = 0 ; i < oColumnNamesArr.length ; i++ ){ 
						InputStream is  =  oDataRs.getBinaryStream(oColumnNamesArr[i]);
					/*	File f = new File("temp.data");
						FileOutputStream fos = new FileOutputStream(f);
						byte[] buff = new byte[16*1024];
						int len = 0 ;
						while( (len = is.read(buff)) > -1 ){
							fos.write(buff, 0,len) ;
						}
						fos.flush() ;
						fos.close() ;
						is.close()  ;*/
						// 
						mysqlUpdatePs.setBinaryStream( i + 1 ,  is);
					}
					// 追加 where 条件,使用主健 或者唯一健 做查询条件
					for (int i = 1 ; i <= keyFieldArr.length ; i++ ){ 
						mysqlUpdatePs.setObject(  oColumnNamesArr.length + i, oDataRs.getObject(keyFieldArr[i-1])) ;
					}
					mysqlUpdatePs.addBatch() ;
			}
			 // 执行
			mysqlUpdatePs.executeBatch() ;
			// 提交事物
		  mysqlConnection.commit() ;
		}
		
	}
	
	/**
	 *  补充 导入 Clob
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public void doImportClob() throws IOException, SQLException, ClassNotFoundException{

		Connection mysqlConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_MYSQL); 
		mysqlConnection.setAutoCommit(false) ;
		
		Connection oracleConnection = ConnectionUtils.getConnection(ConnectionUtils.DB_TYPE_ORACLE); 
		oracleConnection.setReadOnly(true);
		// 找到所有包含 clob 的字段
		String oracleCLOBTableSql = "select  t.TABLE_NAME as TABLE_NAME ,  " 
														   + " to_char(wm_concat(t.COLUMN_NAME)) as COLUMN_NAMES " 
															 + " from user_tab_columns t "
															 + " where  t.DATA_TYPE in ('CLOB') "
														   + " and  t.TABLE_NAME >= 'TASK_LOG_XC' "   //TODO
															 + " and t.TABLE_NAME  not like 'SYS_EXPORT_SCHEMA_%' "  // SYS_EXPORT_SCHEMA_无需导入
															 + " and t.TABLE_NAME  not like 'SYS_LOG' "   // SYS_LOG无需导入
															 + " group by t.TABLE_NAME "
															 + " order by t.TABLE_NAME asc "; 
		ResultSet oracleLobTableRs = this.getResultSet(oracleConnection, oracleCLOBTableSql)  ;
		// 从oracle表 逐一导入
		while (oracleLobTableRs.next()){   // 每一个表
			// 需要处理的字段
			String oColumnNames =  oracleLobTableRs.getString("COLUMN_NAMES") ; 
			String[] oColumnNamesArr = oColumnNames.split(",");
			// 表名
			String oTableName =  oracleLobTableRs.getString("TABLE_NAME") ;  
			System.out.println( "====================表：" + oTableName +  "===============================");
			// 主健字段 或者 唯一健字段  用于匹配数据
			String keyField = this.getKeyField(oracleConnection, oTableName) ;
			String[] keyFieldArr = null ; 
			if ( null != keyField && !"".equals(keyField)){
				keyFieldArr = keyField.split(",");
				System.out.println(" 匹配数据使用主健/唯一健字段：" +  keyField);
			}else{
				System.out.println(" 未找到匹配数据使用主健/唯一健字段！跳过");
				continue ;
			}
			// 开始找数据 
			// oralce  sql
			String oDataSql =  " select "  + keyField + " , " + oColumnNames   +  " from  "  + oTableName  /*+ " where id  =  10003 "*/ ; //TODO
			// oralce ResultSet
			ResultSet oDataRs = this.getResultSet(oracleConnection, oDataSql) ;
			// 准备更 mysql
			// sql
			StringBuilder mysqlUpdateSb  = new StringBuilder(" update  " + oTableName.toLowerCase() + " set " );
			 // 拼凑 待更新字段 
			for (int i = 0 ; i < oColumnNamesArr.length ; i++ ){
				mysqlUpdateSb.append("`" + oColumnNamesArr[i].toLowerCase() + "`"  + " = ? " ) ;
				 // 字段结尾 + ","
				if ( i < oColumnNamesArr.length -1){
					mysqlUpdateSb.append( " , ") ;
				}
			}
			//  where 
			mysqlUpdateSb.append(" where 1=1") ;
			// where clause
			for (int i = 0 ; i < keyFieldArr.length ; i++ ){
				mysqlUpdateSb.append( " and `" + keyFieldArr[i].toLowerCase() + "`"  + " = ? ") ;
				/*// 字段结尾 + ","
				if ( i < keyFieldArr.length -1){
					mysqlUpdateSb.append( " , ") ;
				}*/
			}
			 // 遍历oracle该表每一条数据
			PreparedStatement ps = mysqlConnection.prepareStatement(mysqlUpdateSb.toString()); 
			System.out.println(" 需处理的CLOB字段：" +  Arrays.toString(oColumnNamesArr));
			while (oDataRs.next()){ 
				   // 处理mysql记录 
					// 每一个 CLOB 字段
					for (int i = 0 ; i < oColumnNamesArr.length ; i++ ){
						  oracle.sql.CLOB oC = (oracle.sql.CLOB) oDataRs.getClob(oColumnNamesArr[i]) ;
						  if(null == oC){
							  System.out.println( oColumnNamesArr[i] + "字段在oracle库中值为null！");
							  ps.setString(i+1 , null ) ; 
							  continue ; // 
						  }
						  Reader r = oC.getCharacterStream();
						  StringWriter w = new StringWriter();
					    char[] buff = new char[16*1024] ;
					    int l = 0 ;  // buff 
					    if ( (l = r.read(buff)) > 0 ) {
					    	w.write(buff, 0, l) ;
					    	}
					    String val = w.toString() ;
						 System.out.println( oColumnNamesArr[i] + ":" + val);
						 ps.setString(i+1 , val ) ; 
					}
				 // 追加 where 条件,使用主健 或者唯一健 做查询条件
				for (int i = 0 ; i < keyFieldArr.length ; i++ ){ 
					System.out.println("条件：" + oDataRs.getObject(keyFieldArr[i]));
					ps.setObject(oColumnNamesArr.length + 1 + i, oDataRs.getObject(keyFieldArr[i])) ;
				}
				ps.addBatch() ;
			}
			//
		   System.out.println(Arrays.toString(ps.executeBatch())); 
			 // 每个表 提交一次事物
		  	mysqlConnection.commit() ;
		}
	}
	
	/**
	 * 根据表名 获取此表的唯一健 或者主健 用于oracle和mysql数据匹配 以更新clob/blob
	 * @param oTableName
	 * @return
	 * @throws SQLException 
	 */
	private String getKeyField(Connection oracleConnection,String oTableName) throws SQLException {
		String sql = "select   col.table_name ,to_char(wm_concat(col.column_name ))  as column_names "
				  +	" from  user_constraints con,  user_cons_columns col "
				  +	" where 1=1 "
				  +	" and  con.constraint_name = col.constraint_name"
				  +	" and con.constraint_type   = ?  "
				  +	" and col.table_name  = ? " 
				  + " group by  col.table_name  ";	
		PreparedStatement ps =  oracleConnection.prepareStatement(sql) ;
		ps.setString(1, "P") ;     // 先找主健字段
		ps.setString(2,  oTableName ) ;
		ResultSet rs =	ps.executeQuery() ;
		if (rs.next()){
			return rs.getString("COLUMN_NAMES");
		}else{
			ps.setString(1, "U") ;    // 唯一健字段
			rs =	ps.executeQuery() ;
			if (rs.next()){
				return rs.getString("COLUMN_NAMES");
			}
		}
		return null;
	}

	/**
	 *   查询ResultSet
	 * @param  Connection
	 * @param sql
	 * @return ResultSet  
	 * @throws SQLException
	 */
	private  ResultSet getResultSet(Connection c, String sql) throws SQLException {
		Statement statement = c.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY) ;
		statement.setFetchSize(1000);
		statement.execute(sql);
	 	return statement.getResultSet() ;
	}
	
	/**
	 * mysql InputStream批量导入
	 * @param conn 
	 * @param sql
	 * @param is 
	 * @return 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public int bulkLoadFromInputStream4Mysql(Connection conn, String sql, InputStream is) throws SQLException, IOException, ClassNotFoundException{
		if (is == null){
		  System.out.println(("InputStream is null ,No data is imported"));
			return  0;
		}
		PreparedStatement statement = conn.prepareStatement(sql);
		int result = 0;
		if (statement.isWrapperFor(com.mysql.jdbc.Statement.class)) {
			com.mysql.jdbc.PreparedStatement mysqlStatement = (com.mysql.jdbc.PreparedStatement) statement.unwrap(com.mysql.jdbc.PreparedStatement.class);
			mysqlStatement.setLocalInfileInputStream(is);
			result = mysqlStatement.executeUpdate();
		}
	  // 	  System.out.println("imported:" + result);
		 return  result;
	}

}
