package com.iris.egrant.oracle2mysql;

import java.io.IOException;
import java.sql.SQLException;

public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, IOException, SQLException {
		  Transfer tr = new Transfer() ;
		    // 1、导入文本类型数据
		  // tr.doImportByTable("", null ,"jyfms_dev" );
		  
		  //  2、oracle XMLTYPE导入
		    // tr.doImportXmlType()  ;
		  
	    //3、oracle CLOB导入
		   //  tr.doImportClob() ;
		
		  //4、oracle BLOB导入
		   // tr.doImportBlob() ;
		  
		
	}
}
