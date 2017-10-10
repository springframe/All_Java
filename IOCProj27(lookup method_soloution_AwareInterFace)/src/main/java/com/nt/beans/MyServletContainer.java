package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyServletContainer implements ApplicationContextAware {
	ApplicationContext ctx;
	private RequestHandler handler=null;
	public MyServletContainer()
	{
		System.out.println(");pram contructor");
	}

	/*public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}*/
	public void setApplicationContext(ApplicationContext ctx) throws BeansException 
	{
		this.ctx=ctx;
		// TODO Auto-generated method stub
		System.out.println("===================");
		
	}

	public void handleRequest(String data)
	{
		System.out.println("MyContainer ready to handle the request");
		//create container
		//ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/ApplicationContext.xml");
		
		//get dependency bean class ob
		RequestHandler rw=ctx.getBean("rh",RequestHandler.class);
		rw.processRequest(data);
	}

	
}
