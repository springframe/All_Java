package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Viechle implements ApplicationContextAware{
  private String enngId;

private ApplicationContext ctx;
  
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Viechle :setApplicationContext");
	this.ctx = ctx;
	}
	 public void setEnngId(String enngId) {
		  System.out.println("Viechle:SetEngine");
			this.enngId = enngId;
		}
	public Viechle()
	{
		System.out.println("o-pram contrs");
	}
	 
public void move()
{
	
	Enigne eng=ctx.getBean("engId",Enigne.class);
	eng.start();
	System.out.println("Viechle move for journey");
	
}
}
