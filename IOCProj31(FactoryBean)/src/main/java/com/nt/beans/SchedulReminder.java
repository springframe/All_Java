package com.nt.beans;

import java.util.Date;

public class SchedulReminder {
	private Date date;
	//stter and getter

	public void setDate(Date date) {
		this.date = date;
	}
	//B logices
	public String Reminder()
	{
		if(date.compareTo(new Date(2017-1900,6,3)==true))
		{return "Spring paractise";
		}
		else if(date.compareTo(new Date(117,7,4)))
			return "shoping Remain";
		else
		{
			return "No Reminder isAvailable";
		}
	}

}
