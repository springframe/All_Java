package com.nt.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScoreCompImpl implements ScoreComp {
	
	@Override
	public String findScore(int matchId) 
	{
		try
		{
		System.out.println("from ");
			Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","root");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("SELECT * FROM TB_MATCH WHERE MATCH_ID="+matchId);
	 while(rs.next())
	 {
	
		if(matchId==rs.getInt(1))
		{
		return rs.getString(2);
		}
	/*	else if(matchId==rs.getInt(1))
		{
			return "OndayMatchId::34666/10";
			
		}
		else
			return "Worng MatchId;;;";
	}*/ 
	 }
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return "worng id";
	 }
		
}

