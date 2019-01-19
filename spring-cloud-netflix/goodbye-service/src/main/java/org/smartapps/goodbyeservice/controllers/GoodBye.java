package org.smartapps.goodbyeservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GoodBye {
	
	@GetMapping
	public String sayGoodBye() {
		return "goodBye";
	}
}
