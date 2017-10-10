package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.FlipKart;

public class ClientApp {
	public static void main(String[] args) {
		
		BeanFactory bf=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/ApplicationContext.xml"));
	FlipKart fpk=	bf.getBean("flipKart",FlipKart.class);
	String billmsg=fpk.purchase(new String[]{"mango","angure","apple"});
		System.out.println(billmsg);
	}

}
