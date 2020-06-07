package com.practice.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSessionTemplate sst;
	
	public List<BoardVO> selectAll(HashMap<String, String> map) {
		
		return sst.selectList("selectAll", map);
	}
	
	public BoardVO selectOne(HashMap<String, String> map) {
		
		return sst.selectOne("selectOne", map);
	}
	
	public int insert(HashMap<String, Object> map) {
		return sst.insert("insert", map);
	}

}
