package com.seth.java.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NumberProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberProducerApplication.class, args);
	}

}
