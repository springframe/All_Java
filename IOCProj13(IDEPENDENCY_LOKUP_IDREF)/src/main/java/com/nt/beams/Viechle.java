package com.nt.beams;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Viechle {
private String enggId;
public Viechle()
{
	System.out.println("Viechle:0-param-constructor");
}

public void setEnggId(String enggId) {
	this.enggId = enggId;
}
public void move()
{
	BeanFactory b=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
	Engine egn= b.getBean("enggId",Engine.class);
	egn.start();
	System.out.println("Vechile moved for journy");
}
	
}
