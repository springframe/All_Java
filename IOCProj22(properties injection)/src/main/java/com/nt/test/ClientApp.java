package com.nt.test;

 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.LoanService;

public class ClientApp {
	public static void main(String[] args) {
		// create aop container;

		ApplicationContext aop = new FileSystemXmlApplicationContext(
				"src/main/java/com/nt/cfgs/appplicationContext.xml");

		// get property placeholderConfigure object
		LoanService service = aop.getBean("service", LoanService.class);
		// call b.method()

		float intramt = service.calcIntrAmt(10009, "RAJA", 9000, 5, 5);
		System.out.println("Intr Amount" + intramt);
		
	
	}

}
