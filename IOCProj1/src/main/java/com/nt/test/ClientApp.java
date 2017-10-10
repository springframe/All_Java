package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishGenerator;

public class ClientApp {
	public static void main(String[] args) {
		System.out.println("CLientApp :main(--)");
		
		//load the bean
		BeanFactory bf=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/ApplicationContext.xml"));
		WishGenerator ws=	bf.getBean("wmg",WishGenerator.class);
		System.out.println(ws.generatorWishMsg());
	}

}
