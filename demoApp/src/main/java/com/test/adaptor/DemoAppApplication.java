package com.test.adaptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		System.out.println("Demo Application");
		
		SpringApplication.run(DemoAppApplication.class, args);
	}

}
