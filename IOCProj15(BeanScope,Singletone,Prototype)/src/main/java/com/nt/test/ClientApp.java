package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.DateUtil;

public class ClientApp {
	public static void main(String[] args) {
		//create bean 
		BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		            DateUtil d1=b.getBean("dateUtil",DateUtil.class);
		            DateUtil d2=b.getBean("dateUtil",DateUtil.class);
		            System.out.println(d1==d2);
	}

}
