package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WishMassageGenerator implements BeanFactoryAware,BeanNameAware
 ,InitializingBean,DisposableBean,ApplicationContextAware
 {
	private int age;
	private String name;
	

	public void setAge(int age) {
		System.out.println("this is age setter");
		this.age = age;
	}
	public WishMassageGenerator() 
	{
		System.out.println("0:param contructor");
	}

	public WishMassageGenerator(String name) 
	{
		System.out.println("1:param contructor");
		this.name=name;
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("default destroy(--)");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("AfterProperty Set(--)");
		
	}

	@Override
	public void setBeanName(String args) {
		// TODO Auto-generated method stub
		System.out.println("setName(---)");
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory(--)");
	}
	public void myInit()
	{
		System.out.println("MyInti(---)");
	}
	public void myDestroy()
	{
		System.out.println("myDestroy(--)");
	}

}
