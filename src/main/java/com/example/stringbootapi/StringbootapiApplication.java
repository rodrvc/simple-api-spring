package com.example.stringbootapi;


import com.example.stringbootapi.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class StringbootapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringbootapiApplication.class, args);
	}




}
