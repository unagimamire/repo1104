package com.techscore.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class otameshi01 {

	@RequestMapping("/")
	public String index() {
		return "Hello World‚Ì•\Ž¦‚ðŽÀŽ{";
	}

}