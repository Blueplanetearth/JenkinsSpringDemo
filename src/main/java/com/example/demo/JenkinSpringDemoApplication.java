package com.example.demo;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinSpringDemoApplication.class, args);
		
		 Logger logger =  Logger.getLogger(JenkinSpringDemoApplication.class.getName());
		 
		 logger.info("Hello Jenkins from SpringBoot again");
		
		System.out.println("Hello Jenkins from Springboot project deploy on Github");
	}

}
