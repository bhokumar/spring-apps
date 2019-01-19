package org.smartapps.eurekaservice.controllers;

import org.smartapps.eurekaservice.config.ConfigClientAppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value="/")
public class HealthCheckup {
	
	@Autowired
	private ConfigClientAppConfig  appConfig;
	
	@Value("${service.instance.name}")
	private String instance;
	
	@Value("${some.other.property}")
	private String someOtherProperty;
	
	@GetMapping
	public String getStatus() {
		return "started service instance : "+instance;
	}
	
	@GetMapping("/configs")
	public String printConfig() {
		StringBuilder sb = new StringBuilder();
		sb.append(appConfig.getProperty());
		sb.append(" || ");
		sb.append(someOtherProperty);
		return sb.toString();
	}
}
