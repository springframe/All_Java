package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentEmployeeservice;

public class ClientApp {
	public static void main(String[] args) {
		//create ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		  StudentEmployeeservice c=ctx.getBean("stservice",StudentEmployeeservice.class);
		  //invoke method
		  c.registerEmployee(100, "mansur", "NIT");
		  c.registerEmployee(101, "mansur", "NIT");
		  System.out.println("=====================================");
		  c.registerStudent(102, "hazra","java");
		  c.registerStudent(103, "hazra","java");
		  
		  //close the ioc container
		  ((AbstractApplicationContext) ctx).close();
	}

}
