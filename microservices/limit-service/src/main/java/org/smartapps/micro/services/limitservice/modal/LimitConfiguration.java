package org.smartapps.micro.services.limitservice.modal;

public class LimitConfiguration {
	
	private String minimum;
	private String maximum;
	
	public LimitConfiguration() {
	}
	
	public LimitConfiguration(String minimum, String maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public String getMinimum() {
		return minimum;
	}

	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}

	public String getMaximum() {
		return maximum;
	}

	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}
}
