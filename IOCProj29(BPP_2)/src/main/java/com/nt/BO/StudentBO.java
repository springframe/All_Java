package com.nt.BO;

public class StudentBO extends BaseBO {
	private String course;
	public StudentBO()
	{
		System.out.println("student:0-param:contructor");
	}
	//stter and getter

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
