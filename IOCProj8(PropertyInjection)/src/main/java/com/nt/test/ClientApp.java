package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EmployeeProfile;

public class ClientApp {
	public static void main(String[] args) {
		//create bean class
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		EmployeeProfile emp=b.getBean("emp",EmployeeProfile.class);
		System.out.println(emp);
		
	}

}
