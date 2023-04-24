package com.ust.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/test")
public class FirstbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstbootappApplication.class, args);
	}
	@GetMapping("/first")
//	@RequestMapping("/first")
	public String respond() {
		return "my first rest con troller";
		
	}
//	@RequestMapping("/sec")
	@GetMapping("/sec")
	public String message() {
		return "this is my message";
	}
	
	@GetMapping("/third/{custname}")
	public String greeting(@PathVariable  String custname) {
		return "hello dear"+custname;
		
		
	}
	
	@GetMapping("/fourth/{custname}/{gender}")
	public String greeting(@PathVariable  String custname,@PathVariable  String gender) {
		
		if(gender.equals("male")) {
			return " hello mr"+custname;
		}else if(gender.equals("female")) {
			return "hello ms"+custname;
		}else {
			return "invalid";
		}
		
		
		
		
		
	}
	
				

}
