package com.nt.BO;

public class CustomerBO extends BaseBO {
	private float billAmt;
	public CustomerBO()
	{
		System.out.println("CustBO:0:param contructor");
	}
	//stter and gettter

	public float getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(float billAmt) {
		this.billAmt = billAmt;
	}
	

}
