package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class LoanDAO {
	private static final String INSERT_QRY="INSERT INTO CUSTOMER_LOANINFO VALUES(?,?,?,?)";
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	
	public int insert(CustomerBO cbo)
	{
		Connection con=null;
		PreparedStatement pst=null;
		int result=0;
		try
		{
			//get connection obj from jdbc con pool
			con=ds.getConnection();
			//create prepared statement object
			pst=con.prepareStatement(INSERT_QRY);
			//set value to Query Param
			pst.setInt(1,cbo.getCno());
			pst.setString(2,cbo.getCname());
			pst.setFloat(3,cbo.getPamt());
			pst.setFloat(4,cbo.getIntamt());
			//execute query
			result =pst.executeUpdate();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
		
	}

}
