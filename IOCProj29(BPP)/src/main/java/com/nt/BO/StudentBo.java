package com.nt.BO;

public class StudentBo extends PersonBO {
	private String course;
	//stterANd getter

	/*public String getCourse() {
		return course;
	}*/

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentBo [course=" + course + "]";
	}
	
	
	

}
