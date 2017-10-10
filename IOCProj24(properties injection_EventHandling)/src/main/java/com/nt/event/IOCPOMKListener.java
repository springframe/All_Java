package com.nt.event;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCPOMKListener implements ApplicationListener {
private long end;
private long start;
	
	public void onApplicationEvent(ApplicationEvent ae) 
	{
		System.out.println(ae.toString());
		if(ae.toString().indexOf("Refreshed")!=-1)
		{
			System.out.println("container start time-->"+new Date());
			start=System.currentTimeMillis();
		}
		else if(ae.toString().indexOf("Closed")!=-1)
		{
			System.out.println("end time of container-->"+new Date());
			System.out.println("container Acting time"+(end-start)+"ms");
		}
		else
			System.out.println("hello");
		// TODO Auto-generated method stub
		
	}

}
