package org.smartapps.micro.services.limitservice.controllers;

import org.smartapps.micro.services.limitservice.config.Configuration;
import org.smartapps.micro.services.limitservice.modal.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
	}
}
