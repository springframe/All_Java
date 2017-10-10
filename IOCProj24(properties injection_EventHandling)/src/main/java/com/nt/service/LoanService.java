package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.LoanDAO;

public class LoanService {
	private LoanDAO dao;

	public void setDao(LoanDAO dao) {
		this.dao = dao;
	}
	
	public float calcIntrAmt(int cno,String cname,float pamt,float rate,float time)
	{
		//wriet busssieness logics
		float intramt=pamt*rate*time/100.0f;
		//use DAO class persistence logices
		CustomerBO cbo=new CustomerBO();
		cbo.setPamt(pamt);
		cbo.setCno(cno);
		cbo.setCname(cname);
		cbo.setIntamt(intramt);
		int result=dao.insert(cbo);
		return intramt;
		
	}
	

}
