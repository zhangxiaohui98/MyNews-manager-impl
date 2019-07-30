package com.zhang.mynews.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zhang.mynews.manager.service.TestService;



@Controller
public class LoginTestController {
	
	@Autowired
	private TestService testService;
	
}
