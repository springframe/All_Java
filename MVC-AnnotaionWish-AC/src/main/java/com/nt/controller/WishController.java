package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.nt.service.WishServices;

@Controller
public class WishController {
	@Autowired
	private WishServices service;
	@RequestMapping("/wish.htm")
	public ModelAndView process()
	{
		//use service class
		String msg=service.generateWishMsg();
		return new ModelAndView("result","Wmsg",msg);
	}

}
