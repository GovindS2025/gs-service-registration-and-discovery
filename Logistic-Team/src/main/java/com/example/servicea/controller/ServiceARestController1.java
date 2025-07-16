package com.example.servicea.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceARestController1 {

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Logistic-Team";
	}

}
