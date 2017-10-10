package com.nt.beans;

public class RequestHandler {
	private static int count=0;
	public RequestHandler()
	{
	System.out.println("): pram conructor--->count"+count);
	count++;
	}
	public void processRequest(String data)
	{
		System.out.println("processing Request with data::"+data);
	}

}
