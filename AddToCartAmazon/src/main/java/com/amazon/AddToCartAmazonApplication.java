package com.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.springframework.cloud.openfeign.EnableFeignClients
public class AddToCartAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddToCartAmazonApplication.class, args);
	}

}
