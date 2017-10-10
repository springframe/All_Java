package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class StudentRegistrationController extends SimpleFormController
{
	 @Override
		public Map referenceData(HttpServletRequest request) throws Exception {
		  System.out.println("SRC:referenceData(--)");
		  Map<String,List> map=new HashMap<String,List>();
		  List<String> course=new ArrayList();
		  course.add("Spring");
		  course.add("Hibernate");
		  course.add("webservice");
		  course.add("core java");
		  course.add("Adv java");
		  map.put("courseList",course);
			return map;
		}
		 @Override
		protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
				BindException errors) throws Exception {
			// TODO Auto-generated method stub
			return new ModelAndView("result","formData",command);
		}


}
