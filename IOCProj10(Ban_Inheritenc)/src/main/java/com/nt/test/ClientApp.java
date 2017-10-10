package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Bike;

public class ClientApp {
public static void main(String[] args) {
	//create bean class
	BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	Bike b1=b.getBean("pulsor3",Bike.class);
	System.out.println(b1);
}
}
