package com.nt.beans;

import java.util.Random;

public class FlipKart  {
	private Courier courier;
	public FlipKart()
	{
		System.out.println("FlipKart:0-param Constructor");
	}
	//setter and Getter Method()

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
public String purchase(String items[])
{
	//generate item id
Random rad=new Random();
int orderid=rad.nextInt(700000);
//deliver orderid
String status=courier.deliver(orderid);
return status+"Bill Amt for-->"+ orderid+"is 700000";
}
}
