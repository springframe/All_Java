package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmpSearchService;

public class EmpSearchController extends AbstractCommandController{
 private EmpSearchService service;
 
 	public void setService(EmpSearchService service) {
	this.service = service;
}
	@Override
	public  ModelAndView handle(HttpServletRequest req, HttpServletResponse resp, Object cmd, BindException be)
			throws Exception {
		//get command object
		SearchCommand command=(SearchCommand)cmd;
		//convert Command object into Dto object
		SearchDTO dto=new SearchDTO();
		dto.setNo(command.getNo());
		dto.setName(command.getName());
		dto.setDesg(command.getDesg());
		dto.setSalary(command.getSalary());
		
		//or used beanUtils
		//BeanUtils.copyProperties(command, dto);
		//used service class
		List<SearchResultDTO>listRDTO=service.process(dto);
		return new ModelAndView("listEmps","searchResults",listRDTO);
		////or
		
	}
	

}
