package com.techscore.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1309 {

	@RequestMapping("/")
	public String index() {
		return "Hello World ‚¨ŽŽ‚µ";
	}

}