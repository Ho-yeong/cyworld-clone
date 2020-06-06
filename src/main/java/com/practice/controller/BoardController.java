package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public ModelAndView board() {
		ModelAndView mv = new ModelAndView("board");
		mv.addObject("defaultPic","/img/profile_pic.jpg");
		
		return mv;
	}
}
