package com.nt.command;

public class TestCommand {
	private int sno;
	private String sname;
	private String sadd;
	
	//setter and getter
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	//toString
	@Override
	public String toString() {
		return "TestCommand [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + "]";
	}
	
	
	

}
