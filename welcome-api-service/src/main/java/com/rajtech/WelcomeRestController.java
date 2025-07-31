package com.rajtech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@Autowired
	private GreetFeignClient greetClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMessage() {
		String welcomeMsg = "Welcome to Raj Technologies";
		String greetMsg = greetClient.invokeGreetApi();
		return greetMsg+", "+welcomeMsg;
	}
}
