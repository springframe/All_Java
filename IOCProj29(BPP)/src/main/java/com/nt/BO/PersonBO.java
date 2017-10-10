package com.nt.BO;

import java.util.Date;

public abstract class PersonBO {
	private int no;
	private String name;
	private String course;
	private Date doj;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "PersonBO [no=" + no + ", name=" + name + ", course=" + course + ", doj=" + doj + "]";
	}
	
	//setter and getter
	

		

}
