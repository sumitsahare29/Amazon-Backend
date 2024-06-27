package com.sbs;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name="Sumit";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public User() {
		super();
	}
	
	
}
