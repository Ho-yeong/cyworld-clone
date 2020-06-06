package com.practice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("defaultPic","/img/profile_pic.jpg");
		
		return mv;
	}
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public ModelAndView profile() {
		ModelAndView mv = new ModelAndView("profile");
		mv.addObject("defaultPic","/img/profile_pic.jpg");
		
		return mv;
	}
	
}
