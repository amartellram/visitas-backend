package com.amspace.visitas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/*(
		scanBasePackages = { 
				"com.amspace.visitas.endpoint.config",
				})*/
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}