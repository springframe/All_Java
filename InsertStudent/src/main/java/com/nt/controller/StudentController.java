package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;

public class StudentController extends SimpleFormController
{
@Override
public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
		BindException errors) throws Exception {
	StudentCommand cmd=(StudentCommand)command;
	
	  ModelAndView mav=new ModelAndView();
	   mav.addObject("resultMsg",cmd);
	   //mav.setViewName(this.getSuccessView());
	   mav.setViewName("Reg");
	   mav.addObject("stCmd",cmd);

	return mav;
}
}
