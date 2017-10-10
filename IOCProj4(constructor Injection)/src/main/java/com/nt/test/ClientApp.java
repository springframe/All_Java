package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Faculty;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ClientApp {
	public static void main(String[] args) 
	{
		//create container
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//called bean
		//Student sd=b.getBean("st",Student.class);
		//Marks sd=b.getBean("mks",Marks.class);
		Faculty sd=b.getBean("fclt",Faculty.class);
		System.out.println(sd);
	}

}
