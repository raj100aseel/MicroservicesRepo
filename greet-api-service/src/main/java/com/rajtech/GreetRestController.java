package com.rajtech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@GetMapping("/greet")
	public String greetMessage() {
		return "Hello Good Evening";
	}
}
