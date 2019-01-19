package org.smartapps.configclient.controllers;

import java.util.ArrayList;
import java.util.List;

import org.smartapps.configclient.domain.Orders;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EmployeeController {
	@Value("${orders.type}")
	private String ordersType;
	
	@Value("${orders.value}")
	private String ordersValue;
	
	@GetMapping("/orders")
	public List<Orders> getOrders(){
		List<Orders> orders = new ArrayList<>();
		orders.add(new Orders(ordersType, ordersValue));
		return orders;
	}
}
