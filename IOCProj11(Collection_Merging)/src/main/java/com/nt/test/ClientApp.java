package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EnggCourse;

public class ClientApp {
public static void main(String[] args) {
	//load bean class
	BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	EnggCourse eg=b.getBean("ECE1year",EnggCourse.class);
	System.out.println(eg);
}
}
