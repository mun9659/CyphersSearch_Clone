package com.holo.cyphers.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CyphersController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
