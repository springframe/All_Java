package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.User;

public class ClientApp {
	public static void main(String[] args) {
		//create bean class
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		User u=b.getBean("user",User.class);
		System.out.println(u);
	}

}
