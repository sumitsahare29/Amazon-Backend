package com.sbs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.entity.Student;
import com.sbs.service.Service;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	Service service;

	@RequestMapping("/request")
	@ResponseBody
	public List<Student> requestHandle() {
				
		List<Student> list=	service.businessLogic();
		
		return list;
		
	}
}








