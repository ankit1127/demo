package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("application starts from here");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("application ends here!");

	}

}
