package com.nt.beans;

public abstract class MyServletContainer {
	private RequestHandler handler;
	public MyServletContainer()
	{
		System.out.println(");pram contructor");
	}
	public abstract RequestHandler gethandler();

	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}
	
	public void handleRequest(String data)
	{
		System.out.println("MyContainer ready to handle the request");
	}

}
