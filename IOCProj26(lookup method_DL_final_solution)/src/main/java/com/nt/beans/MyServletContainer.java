package com.nt.beans;

public class MyServletContainer {
	private RequestHandler handler;
	public MyServletContainer()
	{
		System.out.println(");pram contructor");
	}

	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}
	
	public void handleRequest(String data)
	{
		System.out.println("MyContainer ready to handle the request");
	}

}
