package com.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloAWSController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello and Welcome to  AWS EC2 Sprig Web App deploymnt !!!!!";
	}
}
