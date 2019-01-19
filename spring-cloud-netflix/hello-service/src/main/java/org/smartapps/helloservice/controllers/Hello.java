package org.smartapps.helloservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hello {
	
	@GetMapping
	public String sayHello(@RequestHeader("x-location") String location) {
		return "hello from "+location;
	}
}
