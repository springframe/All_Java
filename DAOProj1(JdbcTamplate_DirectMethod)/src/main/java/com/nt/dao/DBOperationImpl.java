package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationImpl implements DBOperations {

	//qry for db
	private static final String INSERT_QRY="INSERT INTO STUDENT0(SNO,SNAME,SJOB,SSAL) values(?,?,?,?)";
	private static final String GET_STD_SAL="SELECT SSAL FROM STUDENT0 WHERE SNO=?";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT SNO, SNAME,SJOB,SSAL FROM STUDENT0 WHERE SNO=?";
	private static final String GET_EMP_ALL_DETAIL="SELECT* FROM EMP";
	private static final String UPDATE_STD_SAL="UPDATE STUDENT0 SET SSAL=? WHERE SNO=?";
	private static final String deletestd="DELETE FROM STUDENT0 WHERE SNO=?";
	private JdbcTemplate jt;
	//setter injection
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(int no, String name, String job, long sal) {
		int result=jt.update(INSERT_QRY, no,name,job,sal);
		return result;
	}

	@Override
	public int getsalary(int no) {
		// TODO Auto-generated method stub
	
		int salary= jt.queryForInt(GET_STD_SAL,no);
		return salary;
	}

	@Override
	public Map<String, Object> listEmpDeatils(int no) {
		// TODO Auto-generated method stub
		Map<String,Object>map=jt.queryForMap(GET_EMP_DETAILS_BY_NO, no);
		return map;
	}

	@Override
	public List<Map<String, Object>> listAllEmpDetails() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list=jt.queryForList(GET_EMP_ALL_DETAIL);
		return list;
	}

	@Override
	public int UpdateStudentSal(int sno, int newsal) {
		// TODO Auto-generated method stub
		int result=jt.update(UPDATE_STD_SAL, newsal,sno);
		return result;
	}

	@Override
	public int deleteSdt(int sno) {
		// TODO Auto-generated method stub
		int result=jt.update(deletestd, sno);
		return result;
	}

}
