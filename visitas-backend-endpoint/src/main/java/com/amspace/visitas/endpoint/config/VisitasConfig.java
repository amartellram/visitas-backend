package com.amspace.visitas.endpoint.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={	
		"com.amspace.visitas.service",
		"com.amspace.visitas.endpoint"})
public class VisitasConfig extends WebMvcConfigurerAdapter{

}
