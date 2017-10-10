package com.nt.beans;

public class Bank {
	public float calcIntrAmt(float pamt,float time,float rate)
	{
		System.out.println("Bank:calcIntrAmt(--)");
		return (pamt*time*rate)/100.0f;
	}

}
