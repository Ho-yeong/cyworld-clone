package com.practice.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DiaryController {
	
	@RequestMapping(value = "/diary", method = RequestMethod.GET)
	public ModelAndView diary() {
		ModelAndView mv = new ModelAndView("diary");
		mv.addObject("defaultPic","/img/profile_pic.jpg");
		
		return mv;
	}
}
