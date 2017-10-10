package com.nt.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmpBO;

public class ListEmpDAOImp implements ListEmpDAO 
{
  private static final String GET_ALL_EMP_DETAILS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
  //INJECT JDBC TEMPLATE
  private JdbcTemplate jt;
  
  
	public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}


	@Override
	public List<EmpBO> retrieveEmps() {
		// TODO Auto-generated method stub
		List<EmpBO>listEmpBO=(List<EmpBO>)jt.query(GET_ALL_EMP_DETAILS,new EmpRowMapper());
				
		
		return listEmpBO;
	}
	private class EmpRowMapper implements RowMapper<EmpBO>
	{

		@Override
		public EmpBO mapRow(ResultSet rs, int pos) throws SQLException {
			// TODO Auto-generated method stub
		
			EmpBO empbo=new EmpBO(rs.getInt(1),rs.getString(2),rs.getString(3),(int) rs.getDouble(4));
			return empbo;
		}
		
	}

}
