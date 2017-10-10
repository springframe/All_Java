package com.nt.beans;

import java.util.Date;

public class Dept {
private int deptno;
private String name;
private Date dop;


public Dept() {

}
public Dept(int deptno, String name, Date dop) {
	super();
	this.deptno = deptno;
	this.name = name;
	this.dop = dop;
}
@Override
public String toString() {
	return "Dept [deptno=" + deptno + ", name=" + name + ", dop=" + dop + "]";
}



}
