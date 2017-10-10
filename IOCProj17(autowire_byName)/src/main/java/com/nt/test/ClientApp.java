package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Car;

public class ClientApp {
	public static void main(String[] args) {
		//create bean container
		
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get besn
		Car c=b.getBean("car",Car.class);
		System.out.println(c);
	}

}
