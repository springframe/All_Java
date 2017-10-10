package com.nt.dao;

import com.nt.BO.CustomerBO;
import com.nt.BO.StudentBO;

public class CustStudDAO {
	public CustStudDAO()
	{
		System.out.println("custStdu-0:param_COntr");
	}
  public void insertStdData(StudentBO bo)
  {
	  System.out.println("studentData::");
	  
	  System.out.println(bo.getId()+"\t"+bo.getName()+"\t"+bo.getCourse()+"\t"+bo.getDoj());
  }
  //simlar for 
  public void insertCustData(CustomerBO cbo)
  {
	  System.out.println("CustomerData:::-->");
	  System.out.println(cbo.getId()+"\t"+cbo.getName()+"\t"+cbo.getBillAmt()+"\t"+cbo.getDoj());
  }
}
