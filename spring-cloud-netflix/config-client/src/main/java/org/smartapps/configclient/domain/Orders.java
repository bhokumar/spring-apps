package org.smartapps.configclient.domain;

import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
public class Orders {
	private String orderType;
	
	private String oderValue;
	
	public Orders(String orderType, String oderValue) {
		super();
		this.orderType = orderType;
		this.oderValue = oderValue;
	}
	
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOderValue() {
		return oderValue;
	}
	public void setOderValue(String oderValue) {
		this.oderValue = oderValue;
	}	
}
