package com.practice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.dao.BoardVO;
import com.practice.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@RequestMapping(value = "/board", method = RequestMethod.GET)
	public ModelAndView board(HttpServletRequest req) {
		// 1. listing each boards
		// 2. importing data from each boards when user click it.
		
		return bs.selectAll("board", req); // default 값 1번 보드
	}
	
	@RequestMapping(value="/board/{boardName}/", method = RequestMethod.GET)
	public ModelAndView board1(@PathVariable("boardName")String boardName, HttpServletRequest req) {
		
		return bs.selectAll(boardName, req);
	}
	
	@RequestMapping(value="/board/{boardName}/{num}/", method = RequestMethod.GET)
	public ModelAndView boardDetail(@PathVariable("boardName")String boardName,
								@PathVariable("num")int num) {
		return bs.selectOne(boardName, num);
	}
	
	@RequestMapping(value="/board/{boardName}/insert/", method = RequestMethod.GET)
	public ModelAndView boardInsert(@PathVariable("boardName")String boardName) {
		ModelAndView mv = new ModelAndView("boardInsert");
		
		return mv;
	}
	
	@RequestMapping(value="/board/{boardName}/insert/", method = RequestMethod.POST)
	public ModelAndView boardInsert(@PathVariable("boardName")String boardName, BoardVO vo) {
		
		return bs.insert(boardName, vo);
	}
}
