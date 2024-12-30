package com.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Nitor3Application {

	@GetMapping(value = "/service-3")
	public String getMessage(){
		return "This is service3";
	}
	public static void main(String[] args) {
		SpringApplication.run(Nitor3Application.class, args);
	}

}
