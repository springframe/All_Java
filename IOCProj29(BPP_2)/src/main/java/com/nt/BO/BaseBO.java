package com.nt.BO;

import java.util.Date;

public abstract class BaseBO {
	private int id;
	private String name;
	private Date doj;
//stter and gettet
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "BaseBO [id=" + id + ", name=" + name + ", doj=" + doj + "]";
	}
	
}
