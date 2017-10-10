package com.ntbeans;

import org.springframework.beans.factory.InitializingBean;

import com.sun.media.jfxmediaimpl.MediaDisposer.Disposable;

public class CheckVotingElgibility implements InitializingBean,Disposable {
	private String name;
	private int age;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void myInit()throws Exception
	{
		System.out.println("");
		//check name ,age address value are correct or not
		if(name==null|| age<=0)
		{
			throw new Exception("set proper value to name,age, baen property value");
		}
	}
		public String checkVotingElgibility(){
			if(age<18)
			{
				return "MR/MISS"+name+"u r not eglibile to vote";
			}
			else
				return "MR/MISS"+name+"u r not eglibile to vote";
				
		}
	
public void myDestroy()
{
	System.out.println("my destroy method");
}
@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println(" this is after property()--my destroy method");
	if(name==null|| age<=0)
	{
		throw new Exception("set proper value to name,age, baen property value");
	}
}
@Override
public void dispose() {
	// TODO Auto-generated method stub
	System.out.println("this is disposale(--) method");
	System.out.println("---------");
}


}