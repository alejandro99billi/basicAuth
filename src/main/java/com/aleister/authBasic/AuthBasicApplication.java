package com.aleister.authBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.alesiter.authBasich.configuration")
public class AuthBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthBasicApplication.class, args);
	}

}
