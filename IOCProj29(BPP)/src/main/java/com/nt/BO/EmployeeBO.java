package com.nt.BO;

public class EmployeeBO extends PersonBO {
	private String companny;
	//stter nad getter

	public void setCompanny(String companny) {
		this.companny = companny;
	}

	@Override
	public String toString() {
		return "EmployeeBO [companny=" + companny + "]";
	}
	

}
