package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

import com.nt.DAO.ListEmpDAO;
import com.nt.bo.EmpBO;
import com.nt.dto.EmpDTO;

public class ListEmpService {
	private ListEmpDAO dao;

	public void setDao(ListEmpDAO dao) {
		this.dao = dao;
	}
	
	public List<EmpDTO> getAllEmps()
	{
		//use dao
		List <EmpBO> listEmpBo=dao.retrieveEmps();
		//copy list bo to dto
		List<EmpDTO> listEmpDto=new ArrayList<EmpDTO>();
		BeanUtils.copyProperties(listEmpBo, listEmpDto);
		/*for(EmpBO bo:listEmpBo)
		{
			EmpDTO empdto=new EmpDTO(bo.getNo(),bo.getName(),bo.getJob(),bo.getSalary());
			listEmpDto.add(empdto);
		}*/
		return listEmpDto;
	}//method

}//class
