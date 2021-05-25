package main.java.com.springrestful;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController {


	@GetMapping("/status")
	public String status() {
		return "{\"status\": \"ok\"}";
	}

	// @GetMapping("/login")
	// public String login(@RequestParam(value = "name", defaultValue = "World") String name) {
	// 	return new Greeting(counter.incrementAndGet(), String.format(template, name));

}
