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
	public void setService(StudentInsertService service) {
		this.service = service;
	}
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest req,HttpServletResponse res)throws Exception
	{
	return new ModelAndView("dblpost");	
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse resp, Object command,
			BindException errors) throws Exception 
	{
		//type cast cmd object
		StudentCommand cmd=(StudentCommand)command;
		//B.logic related validation
		if(cmd.getSadd().equals("delhi"))
		{
			errors.rejectValue("sadd","sadd.city");
			return showForm(req, resp, errors);
		}
		//convert  Comand object to dto object
		StudentDTO dto=new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use serviec class
		String result=service.register(dto);
		//return model and view
		return new ModelAndView(this.getSuccessView(),"regMsg",result);
		
	}
/*	@Override
	protected Object formBackingObject(HttpServletRequest request)throws Exception
	{
		int no=Integer.parseInt("id");
		StudentCommand cmd=new StudentCommand();
		cmd.setSno(no);
		cmd.setSname("mansur");
		cmd.setSadd("koderma");
		
		return cmd;
	}
	*/
	

	
	
}
