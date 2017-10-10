package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;

public class ClientApp {
	public static void main(String[] args) {
		
		MyServletContainer container,container1=null;
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/ApplicationContext.xml");
		
		//get bean
		MyServletContainer sc=ctx.getBean("msh",MyServletContainer.class);
		sc.handleRequest("hello");
		System.out.println("----------------");
		System.out.println("hai..");
		((AbstractApplicationContext) ctx).close();
	}

}
