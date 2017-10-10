package com.nt.beans;

public class Bank {
	public float calcIntrAmt(float pamt,float time)
	{
		System.out.println("Bank:calcIntrAmt(--)");
		return (pamt*time*2.0f)/100.0f;
	}

}
