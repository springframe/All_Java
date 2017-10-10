package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.nt.beans.SchedulReminder;

public class Clienttest {
	public static void main(String[] args) {
		//create ioc container
ApplicationContext ap=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/ApplicationContext.xml");
		//get bean
		//WishMassageGenerator wmg=ap.getBean("wish",WishMassageGenerator.class);
		///BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/ApplicationContext.xml"));
		//write logice
SchedulReminder bx=ap.getBean("reminder",SchedulReminder.class);
		System.out.println(bx.Reminder());
		((AbstractApplicationContext) ap).close();
		
	}

}
