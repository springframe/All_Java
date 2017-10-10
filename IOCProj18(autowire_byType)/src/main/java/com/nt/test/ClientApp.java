package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.TravelAgent;

public class ClientApp {
	public static void main(String[] args) {
		//create bean 
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		TravelAgent t=b.getBean("tagent",TravelAgent.class);
		System.out.println(t);
	}

}
