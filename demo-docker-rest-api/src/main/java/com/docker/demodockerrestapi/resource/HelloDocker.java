package com.docker.demodockerrestapi.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dockerapi")
public class HelloDocker {
	
	@GetMapping("/get/{msg}")
	public String getMessage(@PathVariable("msg") String message) {
		return "Hello" + message;
	}

}
