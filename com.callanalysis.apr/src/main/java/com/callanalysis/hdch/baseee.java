package com.callanalysis.hdch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class baseee 
{
	
	
		public static void insertData(String id,String fromnumber,String Starttime,String endtime,String duration)
		  {
			  String url="jdbc:oracle:thin:@localhost:1521:xe";
			  String user="System";
			  String pass="System";
			  String driver="oracle.jdbc.driver.OracleDriver";
			  String sql="INSERT INTO callanoyi VALUES(?,?,?,?,?)";
			  try
			  {
				Class.forName(driver);
				Connection con =DriverManager.getConnection(url, user, pass);
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,id);
				ps.setString(2,fromnumber);
				ps.setString(3,Starttime);
				ps.setString(4,endtime);
				ps.setString(5,duration);
				
				ps.executeUpdate();
			  }
			  catch(Exception e)
			  {
				e.printStackTrace();
			  }
			  
		  }

		
			
		}
