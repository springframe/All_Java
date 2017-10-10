package com.nt.beans;

import java.util.Set;

public class User {
	private Set<String>phone;

	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [phone=" + phone + "]";
	}
	

}
