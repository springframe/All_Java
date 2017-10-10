package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	public List<StudentBO> getAllStudents();
	public  int insertStudent(StudentBO bo);
	public StudentBO  getStudentByNo(int no);
	public int  modifyStudentByNo(StudentBO bo);
	public int generateStudentNumber();

}
