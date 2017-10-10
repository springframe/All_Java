package com.nt.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public String formatDate(Date dt,String pattern)
	{
		String s=null;
		SimpleDateFormat sdf=new SimpleDateFormat();
		s=sdf.format(dt);
		return s;
	}

}
