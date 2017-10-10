package com.nt.bo;

public class SearchBO {
	
	private int eno;
	private String ename;
	private String desg;
	private int salary;
	
	
	
	public SearchBO() {
		
	}



	public SearchBO(int eno, String ename, String desg, int salary) {
		
		this.eno = eno;
		this.ename = ename;
		this.desg = desg;
		this.salary = salary;
	}



	public int getEno() {
		return eno;
	}



	public void setEno(int eno) {
		this.eno = eno;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getDesg() {
		return desg;
	}



	public void setDesg(String desg) {
		this.desg = desg;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}
}
