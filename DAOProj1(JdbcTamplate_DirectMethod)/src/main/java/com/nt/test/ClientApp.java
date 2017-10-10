package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.service.DBOperationServiceImple;



public class ClientApp {
	public static void main(String[] args) throws Exception {
		//create ioc container
	
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ntcfgs/ApplicationContext.xml"));
		DBOperationServiceImple service=factory.getBean("service",DBOperationServiceImple.class);
		System.out.println(service.RegEmp(102, "mansur", "manager",70));
		System.out.println("==================================");
		 System.out.println(service.showSalary(101));
		 System.out.println("==================================");
		 System.out.println(service.getStddetails(101));
		 System.out.println("================================");
		 System.out.println(service.getAllEmpdetails());
		 System.out.println("=================================");
		 System.out.println(service.UpdateStudent(101, 00));
		 System.out.println("================================");
		 System.out.println(service.deletStudent(102));
	}

}
