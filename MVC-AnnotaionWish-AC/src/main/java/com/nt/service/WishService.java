package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service("ws")
public class WishService implements WishServices{
	@Override
	public String generateWishMsg()
	{
		Calendar cdr=Calendar.getInstance();
		//get curent hour of the day
		int hour=cdr.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
		{
			return "Good Morning";
		}
		else if(hour<=16)
		{
			return "Good after noon";
		}
		else if(hour<=20)
		{
			return "Good Evenig";
		}
		else
		{
			return "Good Night";
		}
	}

}
