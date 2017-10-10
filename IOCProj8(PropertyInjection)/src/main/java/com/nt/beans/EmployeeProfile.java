package com.nt.beans;

import java.util.Properties;

public class EmployeeProfile {
private Properties empDesg;
//setter and getter injection
public void setEmpDesg(Properties empDesg) {
	this.empDesg = empDesg;
}
@Override
public String toString() {
	return "EmployeeProfile [empDesg=" + empDesg + "]";
}




}
