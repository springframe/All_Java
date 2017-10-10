package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.RegisterCommand;

public class RegisterController extends AbstractWizardFormController {

	@Override
	protected ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		System.out.println("RegisterController");
		RegisterCommand cmd=(RegisterCommand)command;
		return new ModelAndView("result","res",cmd);
	}
	@Override
	public ModelAndView processCancel(HttpServletRequest req,HttpServletResponse res,
			Object command,BindException errors)throws Exception
	{
		
		System.out.println("RegisterController--processFinish(--)");
		
		return new ModelAndView("welcome");
	}

}
