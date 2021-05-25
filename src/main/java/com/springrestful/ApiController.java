package com.springrestful;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class ApiController {


	@GetMapping("/status")
	public String status() {
		return "{\"status\": \"ok\"}";
	}

	@PostMapping(path = "/login",  consumes = "application/json")
	public ResponseEntity login(@RequestParam(value = "name") String name, @RequestParam(value = "pw") String pw) {
		if (name == "test" && pw == "1234") {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
	}

	// @GetMapping("/login")
	// public String login(@RequestParam(value = "name", defaultValue = "World") String name) {
	// 	return new Greeting(counter.incrementAndGet(), String.format(template, name));

}
