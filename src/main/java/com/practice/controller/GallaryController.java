package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GallaryController {

	@RequestMapping(value = "/gallary", method = RequestMethod.GET)
	public ModelAndView gallary() {
		ModelAndView mv = new ModelAndView("gallary");
		mv.addObject("defaultPic","/img/profile_pic.jpg");
		
		return mv;
	}
}
