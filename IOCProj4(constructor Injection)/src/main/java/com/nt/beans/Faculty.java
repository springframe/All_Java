package com.nt.beans;

public class Faculty {
private int id;
private String name,subject;
public Faculty(int id, String name, String subject) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
}
@Override
public String toString() {
	return "Faculty [id=" + id + ", name=" + name + ", subject=" + subject + "]";
}


}
