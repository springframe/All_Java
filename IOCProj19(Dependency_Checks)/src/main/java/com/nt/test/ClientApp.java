package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Viechle;

public class ClientApp {
	
	public static void main(String[] args) {
		
	
	//create bean container
	BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	//get bean
	Viechle v=(Viechle)b.getBean("car",Viechle.class);
	System.out.println(v);

}
}