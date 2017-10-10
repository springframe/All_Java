package com.nt.beans;

import java.util.Map;

public class College {
private Map<String,String>facultySubject;
private Map<?,?>facultyPhone;
public void setFacultySubject(Map<String, String> facultySubject) {
	this.facultySubject = facultySubject;
}
public void setFacultyPhone(Map<?, ?> facultyPhone) {
	this.facultyPhone = facultyPhone;
}
@Override
public String toString() {
	return "College [facultySubject=" + facultySubject + ", facultyPhone=" + facultyPhone + "]";
}


}
