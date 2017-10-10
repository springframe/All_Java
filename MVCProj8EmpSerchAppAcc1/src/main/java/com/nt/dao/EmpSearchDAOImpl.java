package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

public class EmpSearchDAOImpl implements EmpSearchDAO 
{

	private static final String EMP_SEARCH_QRY = 
			"select empno,ename,job,sal,deptno,mgr from emp where "
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
		List<SearchResultBO>listRBO=jt.query(EMP_SEARCH_QRY,new EmpRowMapper(),
			bo.getEno(),bo.getEname(),bo.getDesg(),bo.getSalary());
		
		return listRBO;
	}
public static final class EmpRowMapper implements RowMapper<SearchResultBO>
{

	@Override
	public SearchResultBO mapRow(ResultSet rs, int pos) throws SQLException {

			// copy ResultSet Record into SearchResultBo
			SearchResultBO rbo=new SearchResultBO();
			rbo.setNo(rs.getInt(1));
			rbo.setName(rs.getString(2));
			rbo.setDesg(rs.getString(3));
			rbo.setSalary(rs.getInt(4));
			rbo.setMgmrno(rs.getInt(5));
			rbo.setDeptno(rs.getInt(6));
			return rbo;
		}
		
	}

}
