package org.school.spring.bean;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2065306840342179661L;

	public MyEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "Draw Event Ocurred!";
	}
	
	
}
