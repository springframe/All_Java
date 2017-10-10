package com.sdf.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sdf.beans.Meeting;

public class ClientTest {
	public static void main(String[] args) {
		//create ioc container
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/sdf/commans/application-context.xml"));
System.out.println(factory.getBean("meeting",Meeting.class));
Calendar calendar=Calendar.getInstance();
Calendar calendarBean=factory.getBean("calendar",Calendar.class);
System.out.println(calendarBean==calendar);
	}

}
