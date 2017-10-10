package com.nt.beans;

public class BlueDart implements Courier {

	
	public BlueDart()
	{
		System.out.println("BlueDart:0-param COnstructor");
	}
	public String deliver(int orderid) {
		
		return "BlueDart is ready to deliver product of--."+orderid;
	}

}
