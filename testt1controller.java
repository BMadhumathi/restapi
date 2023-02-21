package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testt1controller {
	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
