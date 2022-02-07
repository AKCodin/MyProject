package com.khan;

import java.sql.Connection;
import java.sql.ResultSet;

public class MyClass 
{
	public static void main(String[] args) {
		
		
	String name=null;
	String number=null;
	String timing=null;
	try
	{

		 
			Connection connection=DBUtil.getDataSource().getConnection();  
			java.sql.Statement st=connection.createStatement();
			ResultSet rs=((java.sql.Statement) st).executeQuery("select * from mumbai");
			while(rs.next())
			{
				 name=rs.getString("Train_Name");
				 number=rs.getString("Train_Number");
				 timing=rs.getString("Time");
			}	
			
			System.out.println(name);
			System.out.println(number);
			System.out.println(timing);
				
	}catch(Exception ex)
	{
		ex.printStackTrace();
	}
}
}
