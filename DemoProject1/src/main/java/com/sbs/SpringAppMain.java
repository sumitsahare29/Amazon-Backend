package com.sbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAppMain {

	public static void main(String[] args) {
	ConfigurableApplicationContext container=	SpringApplication.run(SpringAppMain.class, args);
	User user= container.getBean(User.class);
	System.out.println("The name is--> " + user.getName());
		
	}
}
