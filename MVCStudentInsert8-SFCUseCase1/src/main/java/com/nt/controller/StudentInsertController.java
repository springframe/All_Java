package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;

public class StudentInsertController extends SimpleFormController {
	private StudentInsertService service;

	// setter and getter method
	public void setService(StudentInsertService service) {
		this.service = service;
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		//ModelAndView mav = null;
		StudentCommand cmd = null;
		StudentDTO dto = null;
		String result = null;
		// type casting cmd object
		cmd = (StudentCommand) command;
		// convert command object to dto object
		dto = new StudentDTO();
		BeanUtils.copyProperties(cmd,dto);
		// use Service class
		result = service.register(dto);
		// return MAV object
		/*mav = new ModelAndView();
		mav.addObject("resMsg", result);
		mav.setViewName(this.getSuccessView());
		mav.setViewName("student");*/
		return new ModelAndView(this.getSuccessView(),"resMsg",result);
	}

}
