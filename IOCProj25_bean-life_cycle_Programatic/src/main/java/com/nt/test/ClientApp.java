package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ntbeans.CheckVotingElgibility;

public class ClientApp {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		ApplicationContext ap=
				new FileSystemXmlApplicationContext("src/main/java/com/ntcfgs/applicationContext.xml");
		CheckVotingElgibility v=ap.getBean("voter",CheckVotingElgibility.class);
      System.out.println(v);
      System.out.println(v.checkVotingElgibility());
      ((AbstractApplicationContext) ap).close();
	}

}
