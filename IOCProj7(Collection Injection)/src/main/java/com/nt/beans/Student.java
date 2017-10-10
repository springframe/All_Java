package com.nt.beans;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int marks[];
	private List<String> color;
	
	
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setColor(List<String> color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", color=" + color + "]";
	}
	
	

}
