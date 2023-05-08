package com.akash;

import java.sql.*;


public class  DbUtil
{
	public static int save(String firstName, String lastName) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}

		String sql = "insert into dbakash values('" + firstName + "', '" + lastName + "')";
		
		int status = 0;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "akash";
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement())
		{
			status = stmt.executeUpdate(sql);
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		return status;
	}
}

/*
	CREATE TABLE DBSERVLET(FIRSTNAME VARCHAR2(90), LASTNAME VARCHAR2(90));
*/
