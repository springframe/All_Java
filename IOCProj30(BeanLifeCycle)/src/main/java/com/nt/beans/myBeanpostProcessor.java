package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class myBeanpostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String id) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("PPAfterinitailization(--)");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String id) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("PPbeforeInitailization(--)");
		return bean;
	}

}
