package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CustStudService;

public class ClientApp {
	public static void main(String[] args) {
		//create ioc container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/nt/cfgs/ApplicationContext.xml");
		  CustStudService c=ctx.getBean("stservice",CustStudService.class);
		  //invoke method
		/*c.processStudent(100,"masur","java");
		c.processStudent(101,"masur","java");
		System.out.println("===============================");
		c.processCustomer(102,"Ravi",500);
		c.processCustomer(103,"Ravi",500);
		  //close the ioc container
		  ((AbstractApplicationContext) ctx).close();*/
	}

}
