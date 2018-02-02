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
		  Transfer tr =   new Transfer() ;
		  
		  tr.doImportByTable("", null );
		  
	  // tr.doImportByTable("SYS_EXPORT_SCHEMA_03", new Integer(1));
		 //  tr.doImportClob() ;
		 //    tr.doImportBlob() ;
	}
}
