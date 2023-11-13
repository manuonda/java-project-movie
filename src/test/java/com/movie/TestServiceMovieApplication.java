package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestServiceMovieApplication {

	public static void main(String[] args) {
		SpringApplication.from(ServiceMovieApplication::main).with(TestServiceMovieApplication.class).run(args);
	}

}
