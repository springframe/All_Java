package com.nt.beans;

public class DTDC implements Courier {

	public DTDC()
	{
		System.out.println("DTDC:0-param COnstructor");
	}
	public String deliver(int orderid) {
		// TODO Auto-generated method stub
		return "DTDC is ready to delivered product of -->"+orderid;
	}

}
