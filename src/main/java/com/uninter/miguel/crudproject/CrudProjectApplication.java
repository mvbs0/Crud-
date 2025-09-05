package com.uninter.miguel.crudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.uninter")
public class CrudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudProjectApplication.class, args);
	}

}
