package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	
	//bean property
	private String name;
	private Date date;
	
	//generate stter and getter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	//B.logics
	public String generatorWishMsg()
	{
		return "GoodMorning-->"+name+"-->"+date;
	}
	
	
	

}
