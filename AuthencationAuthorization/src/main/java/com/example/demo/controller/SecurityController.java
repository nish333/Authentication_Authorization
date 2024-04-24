package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping("/")
	public String sayHelloAll()
	{
		return "Hello All";
	}
	
	@GetMapping("/user")
	public String sayHelloUser()
	{
		return "Hello User";
	}
	
	@GetMapping("/admin")
	public String sayHelloAdmin()
	{
		return "Hello Admin";
	}

}
