package com.khan;



import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtil
{
private static final String username="root";
private static final String url="jdbc:mysql://localhost:3306/railway_ivr";
private static final String pwd="1234";
private static final String driver="com.mysql.cj.jdbc.Driver";

private static ComboPooledDataSource dataSource;
static
{
	try
	{
		dataSource=new ComboPooledDataSource();
		dataSource.setDriverClass(driver);
	
		dataSource.setJdbcUrl(url);
		dataSource.setUser(username);
		dataSource.setPassword(pwd);
		
		dataSource.setMinPoolSize(50);
		dataSource.setMaxPoolSize(1000);
		dataSource.setAcquireIncrement(5);
	}catch(Exception ex)
	{
		System.out.println(ex);
	}
}
public static ComboPooledDataSource getDataSource() {
	// TODO Auto-generated method stub
	return dataSource;
}
}
