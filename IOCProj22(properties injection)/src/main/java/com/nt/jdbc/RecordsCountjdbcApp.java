package com.nt.jdbc;



import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public class RecordsCountjdbcApp {
	public static void main(String[] args)throws Exception {
		
		//locate property file
		InputStream is=new FileInputStream("src/main/java/com/nt/commans/DBDetails.properties");
		//load property file into to java.util.property class
		Properties props=new Properties();
		props.load(is);
		Class.forName(props.getProperty("db.driver"));
		
		Connection con=DriverManager.getConnection(props.getProperty("db.url"),
				props.getProperty("db.user"),props.getProperty("db.pwd"));
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) from student");
		int cnt=0;
		if(rs.next())
		{
			cnt=rs.getInt(1);
		}
		System.out.println("Record count"+cnt);
	//close jdbc object
		rs.close();
		st.close();
		con.close();
		
	}

}
