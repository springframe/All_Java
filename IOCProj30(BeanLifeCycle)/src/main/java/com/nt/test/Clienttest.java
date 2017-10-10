package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMassageGenerator;

public class Clienttest {
	public static void main(String[] args) {
		//create ioc container
		//ApplicationContext ap=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/ApplicationContext.xml");
		//get bean
		//WishMassageGenerator wmg=ap.getBean("wish",WishMassageGenerator.class);
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/ApplicationContext.xml"));
		//write logice
		//WishMassageGenerator bx=b.getBean("wish",WishMassageGenerator.class);
		
		//((AbstractApplicationContext) ap).close();
		
	}

}
