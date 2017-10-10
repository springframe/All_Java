package com.nt.beans;

public class LoanDetail {
	private int loanId;
	private String loantype;
	private String customer;
	public LoanDetail()
	{
		
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "LoanDetail [loanId=" + loanId + ", loantype=" + loantype + ", customer=" + customer + "]";
	}
	
	

}
