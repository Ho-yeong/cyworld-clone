package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestController {

	@RequestMapping(value = "/guest", method = RequestMethod.GET)
	public ModelAndView guest() {
		ModelAndView mv = new ModelAndView("guest");
		mv.addObject("defaultPic","/img/profile_pic.jpg");
		
		return mv;
	}
}
