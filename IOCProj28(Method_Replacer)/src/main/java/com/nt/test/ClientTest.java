package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bank;

public class ClientTest {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
		Bank b=ct.getBean("bank",Bank.class);
		System.out.println("intrAmt-->"+b.calcIntrAmt(20000,20));
	}

}
