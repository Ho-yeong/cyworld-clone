package com.practice.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.practice.dao.BoardDAO;
import com.practice.dao.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	public ModelAndView selectAll(String boardName, HttpServletRequest req) {
		
		ModelAndView mv = new ModelAndView("/board");
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("board1", boardName);
		
		List<BoardVO> list = dao.selectAll(map);
		
		String path = req.getRequestURI().replace(req.getContextPath() + "/board/", "").replace("/", "");
		System.out.println(req.getRequestURI());
		System.out.println(req.getContextPath());
		System.out.println(path);
		mv.addObject("path", path.equals("myappboard")  ? "board" : path);
		
		mv.addObject("list", list);
		
		return mv;
	}
	
	public ModelAndView selectOne(String boardName, int num) {
		
		ModelAndView mv = new ModelAndView("boardDetail");
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("boardName", boardName);
		map.put("num", String.valueOf(num));
		
		BoardVO board = dao.selectOne(map);
		
		mv.addObject("board", board);
		
		return mv;
	}
	
	public ModelAndView insert(String boardName, BoardVO vo) {
		
		ModelAndView mv = new ModelAndView("redirect:/board/" + boardName + "/");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("boardName", boardName);
		map.put("vo", vo);
		
		int result = dao.insert(map);
		
		if(result == 1)
			return mv;
		else {
			mv.setViewName("error");
			return mv;
		}
	}
}
