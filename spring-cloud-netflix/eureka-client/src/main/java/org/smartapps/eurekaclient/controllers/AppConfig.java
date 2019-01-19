package org.smartapps.eurekaclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class AppConfig {
	@Autowired
	private EurekaClient client;
	
	@Autowired
	private RestTemplateBuilder templateBuilder;
	
	@GetMapping("/configs")
	public String getConfig() {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("config-client-service", false);
		final String baseUrl = instanceInfo.getHomePageUrl();
		RestTemplate restTemplate = templateBuilder.build();
		ResponseEntity<String> response  = restTemplate.exchange(baseUrl+"/configs", HttpMethod.GET, null, String.class);
		return response.getBody();
	}
}
