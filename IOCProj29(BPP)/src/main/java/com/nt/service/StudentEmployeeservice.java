package com.nt.service;

import com.nt.BO.EmployeeBO;
import com.nt.BO.StudentBo;
import com.nt.dao.StudentEmployeeDAO;

public abstract class StudentEmployeeservice 
{
	private StudentEmployeeDAO dao;

	public void setDao(StudentEmployeeDAO dao)
	{
		this.dao = dao;
	}
	
	public abstract StudentBo getStudentBo();
	public abstract EmployeeBO getEmployeeBo();
	
	public void registerStudent(int no,String name,String course)
	{
		//get StudentBO
		StudentBo b=new StudentBo();
		b.setNo(no);
		b.setName(name);
		b.setCourse(course);
		//b.setDoj(doj);
	}
	//
	public void registerEmployee(int no,String name,String companny)
	{
		//get StudentBO
		EmployeeBO bo=new EmployeeBO();
		bo.setNo(no);
		bo.setName(name);
		bo.setCompanny(companny);
		//b.setDoj(doj);
	}
	

}
