package com.iris.egrant.oracle2mysql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class GenDDL4Mysql {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// File f = new File("template/createTableDDL4Mysal.sql");
		InputStream is = GenDDL4Mysql.class.getClassLoader().getResourceAsStream("template/createTableDDL4Mysql.sql") ;
	 //	FileInputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader in = new BufferedReader(isr);
		StringBuffer str = new StringBuffer("");
		String line;
		while( (line = in.readLine())!=null ){
			 str.append(line);
		 }
		 //  System.out.println(str);
		 String[] arr = str.toString().split("###");
		  for (String s : arr) {
		 // 	System.out.println(s);
		}
		//  System.out.println(arr[0]);
		  //System.out.println(arr[1]);
		  // System.out.println(arr[2]);
		  
		 String tableName =  arr[0].trim().replace("DROP TABLE ", "").replace(";", "").trim();
		 String columnsStr = arr[1].trim().replace("CREATE TABLE " + tableName, "").replace(";", "").trim();
		 columnsStr = columnsStr.substring(1, columnsStr.length() -1 );
		 String[] columnsArr = columnsStr.split(" ,");
		 
		 String[] commentsArr = arr[2].split(";");
		 List<String>  commentsList = Arrays.asList(commentsArr);
		 
		 StringBuffer sb = new StringBuffer() ;
		 sb.append("DROP TABLE IF EXISTS " + tableName + " ;" );
		 sb.append("CREATE TABLE " + tableName + "( ");
		 for (String cs : columnsArr) {
			 loop: for (String s : cs.split(" ")) {
				   for (String l : commentsList) {
					   for (String ts : l.split(" ")) {
						     if(ts.equals( tableName + "." + s)){
						    	 cs  = cs  + " COMMENT " +  l.substring(l.indexOf("'") -1 );
						    	 break loop;
						     }
					}
				}
			}
		 sb.append(cs + "," );
		}
		 sb.append(" PRIMARY KEY(" + "PK" + ")");
		 sb.append(" ) ");
		 sb.append(commentsList.get(0).replace("ON TABLE " +tableName+" IS", "=") + " ;");
		 
		 System.out.println(
				   sb.toString()
				   .replace("VARCHAR2", "varchar")
				   .replace("SYS.XMLTYPE", "text")
				   .replace("NUMBER", "decimal")
				   );
		 
		 /*
		  * ALTER TABLE `grant_setting_bak` 
 ADD INDEX `idx_grant_setting_bak_enabled` (`enabled`),
 ADD INDEX `idx_grant_setting_bak_level` (`grant_level`),
 ADD INDEX `idx_grant_setting_bak_pcode` (`parent_code`)
 ;

		  * */
	}
}
