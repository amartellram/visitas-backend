package com.amspace.visitas.endpoint.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@RequestMapping(value = "/login/", method = RequestMethod.GET)
	public String login() {
		
		return "Login";
	}
	
	@RequestMapping(value = "/test/", method = RequestMethod.POST)
	public String test() {
		
		return "Login";
	}
}
