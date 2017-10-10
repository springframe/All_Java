package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Dept;
import com.nt.beans.Emp;

public class ClientApp {
	public static void main(String[] args) {
		//create bean container
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/appplicationContext.xml"));
		Emp d=	b.getBean("emp",Emp.class);
		System.out.println(d);
	}

}
