package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.DBOperations;

public class DBOperationServiceImple implements DBOperationService{
	private DBOperations dao;

	public void setDao(DBOperations dao) {
		this.dao = dao;
	}
	@Override
	public String RegEmp(int no,String name,String job,long sal)
	{
		int result=dao.insert(no, name, job, sal);
		if(result==0)
		{
			return no+"-->Emp is not Register";
		}
		else
			return no+"-->Emp is Register Successfully";
	}
	//
	@Override
	public int showSalary(int no)
	{
		int sal=dao.getsalary(no);
		return sal;
		
	}
	@Override
	public Map<String, Object> getStddetails(int sno) {
		// TODO Auto-generated method stub
		Map<String, Object> map=dao.listEmpDeatils(sno);

		
			return map;
	}
	@Override
	public List<Map<String, Object>> getAllEmpdetails() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list=dao.listAllEmpDetails();
		return list;
	}
	@Override
	public String UpdateStudent(int no, int newno) {
		// TODO Auto-generated method stub
		int result=dao.UpdateStudentSal(no, newno);
		if(result==0)
		return no+"-->std not upadate";
		else
			return no+"--> std update sucessfully";
	}
	@Override
	public String deletStudent(int no) {
		// TODO Auto-generated method stub
		int result=dao.deleteSdt(no);
		if(result==0)
		return no+"--> student is not delete";
		else
			return no+"-->student record is deleted successfully";
	}
	
	}

