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
		  tr.doImportByTable("XML_UPDATE_LOG", 1 ,"jyfms_dev" );
		  
	   //2、oracle CLOB导入
		 //  tr.doImportClob() ;
		
		  //3、oracle BLOB导入
		 //tr.doImportBlob() ;
	}
}
