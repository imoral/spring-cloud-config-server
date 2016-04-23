package com.imoral.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class Application {

	@Value("${spring.application.name}")
	String name = "Application";
	
	@Value("${message.welcome}")
	String welcomeMsg = "Hello World";

	@RequestMapping("/")
	public String home() {
		return name + ": " + welcomeMsg;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
