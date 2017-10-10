package com.nt.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServletControler {
	@RequestMapping("/home.htm")
	public String process()
	{
		return "result";
	}

}
