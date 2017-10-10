package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;
import com.nt.dao.EmpSearchDAO;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

public class EmpSearchServiceImpl implements EmpSearchService {
      private EmpSearchDAO dao;
      
	
	public void setDao(EmpSearchDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<SearchResultDTO> process(SearchDTO sdto) {
		//covaert SearchDTO object to SearchBo object
		SearchBO sbo=new SearchBO();
		sbo.setEno(sdto.getNo());
		sbo.setEname(sdto.getName());
		sbo.setDesg(sdto.getDesg());
		sbo.setSalary(sdto.getSalary());
		//use ubs.copyproperty
		//BeanUtils.copyProperties(sdto, sbo);
		//use  DAO
		List<SearchResultBO>listRBO =dao.search(sbo);
		//convert LIStRBO toListRDTO
		List<SearchResultDTO> listRDTO=new ArrayList<SearchResultDTO>();
		for(SearchResultBO rbo:listRBO)
		{
		SearchResultDTO rdto=new SearchResultDTO();
		 rdto.setNo(rbo.getNo());
		 rdto.setName(rbo.getName());
		 rdto.setDesg(rbo.getDesg());
		 rdto.setSalary(rbo.getSalary());
		 rdto.setDeptno(rbo.getDeptno());
		 rdto.setMgmrno(rbo.getMgmrno());
		 listRDTO.add(rdto);
		}
		//or
		//BeanUtils.copyProperties(listRBO, rdto);
		
		return listRDTO;
	}

}
