package com.example.aunhapum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AunhapumController {
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
