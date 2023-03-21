package com.example.ClaseTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClaseTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaseTestApplication.class, args);
	}
	@GetMapping
	public String test(){
		return "hola mundo";
	}
	@GetMapping("/test")
	public String test1(){
		return "hola mundo otra vez";
	}
}
