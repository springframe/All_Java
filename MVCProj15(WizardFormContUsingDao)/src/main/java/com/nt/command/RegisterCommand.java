package com.nt.command;

public class RegisterCommand {
	//login creadential
	private String userName;
	private String password;
	//contact details
	private String emailId;
	private int phoneNo;
	//Address details
	private String city;
	private int pinCode;
	//setter and getter
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "RegisterCommand [userName=" + userName + ", password=" + password + ", emailId=" + emailId
				+ ", phoneNo=" + phoneNo + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
