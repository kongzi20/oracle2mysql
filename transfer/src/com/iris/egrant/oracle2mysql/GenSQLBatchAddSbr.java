package com.iris.egrant.oracle2mysql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Date;

public class GenSQLBatchAddSbr {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		InputStream is = GenSQLBatchAddSbr.class.getClassLoader().getResourceAsStream("template/addPsnSqlTemplate-oracle.sql");
		// 读去sql模版
		 // File f = new File("");
		// FileInputStream fis =  new FileInputStream(is);
		 InputStreamReader  isr =  new InputStreamReader(is);
		 BufferedReader br = new BufferedReader(isr);
		 String tempStr  ;
		 StringBuffer sb = new StringBuffer();
		 while((tempStr = br.readLine())!=null){
			 sb.append(tempStr + " \n");
		 }
	  // 所需参数
    int cnt = 1 ;   // 需要添加个数
    long psnCodeStart  = 100043561L ;  // psn_code 起始值（从数据库查询 seq_person.currval），每次递增1
    String vOrgCode = "10008608" ; //    // 单位code
    StringBuffer emailSb = new StringBuffer();  
   // 修改sql
    String sqlStr  ;
    String v_psn_code   ; 
    String v_email   ; 
    for(int i = 0 ; i< cnt ;i ++ ){
    	sqlStr = sb.toString();
    	v_psn_code = (++psnCodeStart) + "" ; // 新生成psn_code
    	v_email  = v_psn_code + "@irissz.qq.com" ;
    	emailSb.append(v_email + "," + CipherUtil.encodeByMD5(v_email + "|111111" ) + "\n") ;
    	sqlStr = sqlStr/*.replace("v_psn_code",  v_psn_code )*/
    			           .replace("v_org_code",  vOrgCode )  
    			           .replace("v_psn_name", "Test0829-申报人" +  v_psn_code )  // 姓名
    			           .replace("v_mobile",   18 + v_psn_code )  // 手机号
    			           .replace("v_email",  v_email  )  // 邮箱
    			           ;  
    	System.out.println(sqlStr);
   		}
    System.out.println(" /*----------本次添加帐号--------------");
    System.out.println(emailSb.toString());
     // System.out.println();
    System.out.println("*/");
	}
}
