package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentInsertDAOImpl implements StudentInsertDAO {
	private static final String INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?)";
	private JdbcTemplate jt;

	// setter method
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(StudentBO sbo) {
		int count;
		count = jt.update(INSERT_QUERY, sbo.getSno(),
										sbo.getSname(),
										sbo.getSadd());
		return count;
	}

}
