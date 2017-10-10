package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.College;
import com.nt.beans.Student;
import com.nt.beans.User;

public class ClientApp {
public static void main(String[] args) {
	
	BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	//Student s=b.getBean("std",Student.class);
	//User s=b.getBean("ur",User.class);
	College s=b.getBean("clg",College.class);

	System.out.println(s);
}
}
