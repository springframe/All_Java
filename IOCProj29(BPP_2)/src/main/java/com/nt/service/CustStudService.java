package com.nt.service;

import com.nt.BO.CustomerBO;
import com.nt.BO.StudentBO;
import com.nt.dao.CustStudDAO;

public abstract class CustStudService {
	private CustStudDAO dao;
	public CustStudService()
	{
		System.out.println("CustStudeService:0:param Contructor");
	}
public abstract StudentBO getStudentBO();
public abstract CustomerBO getCustomerBO();
	public void setDao(CustStudDAO dao) {
		this.dao = dao;
	}
	public void processStudent(int id,String name,String course)
	{
		System.out.println("processing studentBo info--");
		StudentBO stbo=new StudentBO();
		stbo.setId(id);
		stbo.setName(name);
		stbo.setCourse(course);
		//use dao
		dao.insertStdData(stbo);
	}
	
	public void processCustomer(int id,String name,float billAmt)
	{
		System.out.println("--processing Customer info--");
		CustomerBO cbo=new CustomerBO();
		//set the value
		cbo.setId(id);
		cbo.setName(name);
		cbo.setBillAmt(billAmt);
		//use dao
		dao.insertCustData(cbo);
	}


}
