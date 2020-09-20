package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		//Logging refers to the recording of activity by an application
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
		SpringApplication.run(DemoApplication.class, args);
	}
}
