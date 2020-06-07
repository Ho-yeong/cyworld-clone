package com.practice.dao;

import java.sql.Date;

public class BoardVO {
	/*
	 * 	BNUM	NUMBER
		TITLE	VARCHAR2(100 BYTE)
		WRITER	VARCHAR2(50 BYTE)
		CONTEXT	VARCHAR2(1000 BYTE)
		TIME	DATE
		VIEWS	NUMBER
	 * */
	
	private int bnum;
	private String title;
	private String writer;
	private String context;
	private Date time;
	private int views;
	
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
}
