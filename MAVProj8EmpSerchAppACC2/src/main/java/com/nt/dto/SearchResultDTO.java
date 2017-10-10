package com.nt.dto;

import java.io.Serializable;

public class SearchResultDTO implements Serializable{

	private int no;
	private String name;
	private String desg;
	private int  salary;
	private int deptno,mgmrno;
	public SearchResultDTO() {
		
	}
	public SearchResultDTO(int no, String name, String desg, int salary, int deptno, int mgmrno) {
		this.no = no;
		this.name = name;
		this.desg = desg;
		this.salary = salary;
		this.deptno = deptno;
		this.mgmrno = mgmrno;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getMgmrno() {
		return mgmrno;
	}
	public void setMgmrno(int mgmrno) {
		this.mgmrno = mgmrno;
	}

	
	
	
}
