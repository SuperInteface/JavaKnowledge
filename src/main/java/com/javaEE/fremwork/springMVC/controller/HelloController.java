package com.javaEE.fremwork.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class HelloController {

	@ResponseBody
	@RequestMapping(path = "/hello")
	public String hello() {
		System.out.println("hello console");
		return "hello";
	}

}
