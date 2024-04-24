package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@EnableWebSecurity
@SpringBootApplication
public class AuthencationAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthencationAuthorizationApplication.class, args);
	}

}
