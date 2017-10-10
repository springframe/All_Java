package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date>

{
  private int year;
private int month;
private int date;

//setter and getter
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDate() {
	return date;
}
public void setDate(int date) {
	this.date = date;
}
public Date getObject() throws Exception {
	System.out.println("DBF:getObject()");
	return new Date(year-1900,month,date);
}
public Class<?> getObjectType() {
	System.out.println("DFB:getObjectType()");
	return Date.class;
}
public boolean isSingleton() {
	System.out.println("DFB:isSingleton()");
	return true;
}
}
