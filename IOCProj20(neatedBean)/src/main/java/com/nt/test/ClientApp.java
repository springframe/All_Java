package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.BankLoanApprover;

public class ClientApp {
	public static void main(String[] args) {
		//create parent bean 
		BeanFactory b1=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/approval-bean.xml"));
		//create child bean
		BeanFactory b2=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/loan-bean.xml"));
		
		//get bean
		BankLoanApprover bnk=b2.getBean("id",BankLoanApprover.class);
		System.out.println(bnk.approvver());
	}

}
