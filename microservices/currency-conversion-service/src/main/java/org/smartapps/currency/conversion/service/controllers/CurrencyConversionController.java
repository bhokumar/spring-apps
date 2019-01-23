package org.smartapps.currency.conversion.service.controllers;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.smartapps.currency.conversion.service.modal.CurrencyConversionBean;
import org.smartapps.currency.conversion.service.proxy.CurrencyExchangeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class CurrencyConversionController {
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	@GetMapping("/currency/converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retrieveConversionBean(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency/exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);
		CurrencyConversionBean conversionBean = responseEntity.getBody();
		return new CurrencyConversionBean(conversionBean.getId(), from, to, BigDecimal.ONE,
				conversionBean.getConversionMultiple(), quantity.multiply(conversionBean.getConversionMultiple()), conversionBean.getPort());
	}
	
	
	@HystrixCommand(fallbackMethod = "errorHandler")
	@GetMapping("/currency/converter/feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConversionBean conversionBean = proxy.retrieveValue(from, to);
		return new CurrencyConversionBean(conversionBean.getId(), from, to, BigDecimal.ONE,
				conversionBean.getConversionMultiple(), quantity.multiply(conversionBean.getConversionMultiple()), conversionBean.getPort());
	}
	
	public CurrencyConversionBean errorHandler(String from, String to, BigDecimal quantity) {
		return new CurrencyConversionBean(1001L, from, to, BigDecimal.valueOf(65), quantity, quantity.multiply(quantity), 8400 );
	}
}
