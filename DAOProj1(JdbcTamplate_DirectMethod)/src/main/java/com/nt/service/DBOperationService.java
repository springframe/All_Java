package com.nt.service;

import java.util.List;
import java.util.Map;

public interface DBOperationService {
	public String RegEmp(int no,String name,String job,long sal);
	public int showSalary(int no);
	public Map<String,Object> getStddetails(int sno);
	public List<Map<String,Object>>getAllEmpdetails();
	public String UpdateStudent(int no,int newno);
	public String deletStudent(int no);
	
}
