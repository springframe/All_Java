package com.nt.service;

import org.springframework.beans.BeanUtils;


import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {

	private StudentInsertDAO dao;
	
	public void setDao(StudentInsertDAO dao)
	{
		this.dao = dao;
	
	}

	@Override
	public String register(StudentDTO dto) {
		// convert DTO Obj to BO Object
		StudentBO sbo=new StudentBO();
		BeanUtils.copyProperties(sbo, dto);
		int cnt=dao.insert(sbo);
		if(cnt==0)
			return "Student Registration failed";
		else
			return "Student Registration Success with no-->"+sbo.getSno();
		
	}

}
