package com.nt.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	private float rate=0.0f;
	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable 
	{
		//logice
		
		System.out.println("IntrrateReplacer:reimplemnts(--)");
		System.out.println("bean class"+bean.getClass()+"Method name"+method.getName()+"Method Array"+Arrays.toString(args));
		if(method.getName().equals("calcIntrAmt"))
		{
			float pamt=(float)args[0];
			float time=(float)args[1];
			//calculate IntrAmt with discount rate
			if(pamt>=5000)
			{
				rate=2.0f;
			}
			else
			{
				rate=1.0f;
			}
			return (pamt*time*rate);
		}
		return 0.0f;

	}

}
