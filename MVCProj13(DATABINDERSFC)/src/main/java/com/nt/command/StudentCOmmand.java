package com.nt.command;

import java.util.Date;

public class StudentCOmmand {
	private String name;
	private Date dob,doj,dom;
	
	//setter and getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "StudentCOmmand [name=" + name + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
}
