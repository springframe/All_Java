package com.nt.beans;


public class BankLoanApprover {
	private LoanDetail details;

	public BankLoanApprover() {
		
	                        }

	public void setDetails(LoanDetail details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "BankLoanApprover [details=" + details + "]";
	}
	
	public String approvver()
	{
		if(details.getLoantype().equals("two wheeler"))
		{
			return "Loan is approved";
		}
		else
		{
			return "Loan is Rejected";
		}
	}
}
