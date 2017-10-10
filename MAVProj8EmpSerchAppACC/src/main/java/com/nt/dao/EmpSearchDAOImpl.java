package com.nt.dao;

import java.util.List;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

public class EmpSearchDAOImpl implements EmpSearchDAO {

	private static final String EMP_SEARCH_QRY = "select empno,ename,job,sal,deptno,mgr from emp where "
			+ "(empno is not null and empno=?) " 
			+ "or (ename is not null and ename like ?) "
			+ "or (job is not null and job like ?) " 
			+ "or (sal is not null and sal =?)";

	private JdbcTemplate jt;
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public List<SearchResultBO> search(SearchBO bo) {
		// TODO Auto-generated method stub
		return null;
	}

}
