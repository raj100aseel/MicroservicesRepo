package com.rajtech;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="greet-api")
public interface GreetFeignClient {
	@GetMapping("/greet")
	public String invokeGreetApi();
}
