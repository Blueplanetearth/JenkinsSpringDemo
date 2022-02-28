package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinSpringDemoApplication.class, args);
		
		System.out.println("Hello Jenkins from Springboot");
	}

}
