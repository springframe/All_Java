package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ClientApp {
	public static void main(String[] args) {
		//create ioc container
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		
		
		//get bean
		Class c=b.getBean("c1",Class.class);
		
		System.out.println("c data"+c+"c1 class name"+c.getClass());
		//get bean
		/* Calendar cd=b.getBean("c2",Calendar.class);
		 System.out.println("c2 data"+cd+"c2 class name-->"+cd.getClass());
		 
		 //getbean
		 String s1=b.getBean("s2",String.class);
		 System.out.println("s1 data is"+s1+"s1 class name--->"+s1.getClass());
		 
		 //get bean
	 String sb2=b.getBean("sb2",String.class);
		 System.out.println("sb2 data-->"+sb2+"sb2 class name-->"+sb2);*/
	}

}
