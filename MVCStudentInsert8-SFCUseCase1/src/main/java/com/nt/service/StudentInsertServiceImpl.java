package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {
	private StudentInsertDAO dao;

	// setter method
	public void setDao(StudentInsertDAO dao) {
		this.dao = dao;
	}

	@Override
	public String register(StudentDTO dto) {
		StudentBO sbo = null;
		int count ;
		// convert DTO to BO;
		sbo = new StudentBO();
		BeanUtils.copyProperties(dto,sbo);
		// use DAO
		count = dao.insert(sbo);
		// result
		if (count == 0)
			return "Student Registration failed";
		else
			return "Student Registration Succeded with no" + sbo.getSno();
	}

}
