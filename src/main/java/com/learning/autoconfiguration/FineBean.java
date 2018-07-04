package com.learning.autoconfiguration;

import org.springframework.stereotype.Component;

@Component
public class FineBean {

	private String name;

	public FineBean() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
