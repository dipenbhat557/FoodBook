package com.foodbook.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController{

	@RequestMapping("/")
	public String test(){
		return "Hello this is a test program";
	}
}
