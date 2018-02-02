package com.iris.egrant.oracle2mysql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *  oracle 数据转 mysql
 * @author cg
 *
 */
public class ConnectionUtils {
	
	public static final String DB_TYPE_MYSQL = "Mysql";
	public static final String DB_TYPE_ORACLE = "Oracle";
	
	/*
	 * 驱动相关属性
	 */
	private static Properties driverProperties = new Properties() ;
	
	static{
		 InputStream is = ConnectionUtils.class.getClassLoader().getResourceAsStream("driver/driverconfig.properties");
		 try {
			driverProperties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
   // 		System.out.println(driverProperties);
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static Connection getConnection(String dbType) throws IOException, SQLException, ClassNotFoundException {
		Connection c = null;
		String username = null;
		String password = null;
		String url = null;
		String drivername = null;
		if (ConnectionUtils.DB_TYPE_MYSQL.equals(dbType)) {
			username = driverProperties.getProperty("mysql.username");
			password = driverProperties.getProperty("mysql.password");
			url = driverProperties.getProperty("mysql.url");
			drivername = driverProperties.getProperty("mysql.drivername");
		} else if (ConnectionUtils.DB_TYPE_ORACLE.equals(dbType)) {
			username = driverProperties.getProperty("oracle.username");
			password = driverProperties.getProperty("oracle.password");
			url = driverProperties.getProperty("oracle.url");
			drivername = driverProperties.getProperty("oracle.drivername");
		}
		Class.forName(drivername);
		c = DriverManager.getConnection(url, username, password);
		return c;
	}
}
