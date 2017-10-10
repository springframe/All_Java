package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beams.Viechle;

public class ClientApp {
	public static void main(String[] args) {
		
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	  Viechle v=b.getBean("vechile",Viechle.class);
	  v.move();
	}
	

}
