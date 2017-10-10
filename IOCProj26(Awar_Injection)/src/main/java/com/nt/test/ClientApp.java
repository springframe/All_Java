package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext ap=
				new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/ApplicationContext.xml");
		Viechle v=ap.getBean("viechle",Viechle.class);
		v.move();
	}

}
