package com.Retrieving;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBconfig {

	public static Connection getConnection(Properties prop)
	{
		Connection con = null;
		try
		{
			Class.forName(prop.getProperty("driver"));
			con = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}
