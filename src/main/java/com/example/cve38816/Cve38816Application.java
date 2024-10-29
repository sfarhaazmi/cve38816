package com.example.cve38816;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Cve38816Application {

	private static final Logger logger = LoggerFactory.getLogger(Cve38816Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Cve38816Application.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> staticResourceRouter() {
		logger.info("here");
		String str = "I am here";
		System.out.println(str);
		return RouterFunctions.resources("/static/**", new FileSystemResource("src/main/resources/static/"));
	}
}