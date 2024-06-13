package com.excelr.springbootStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootStartApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringbootStartApplication.class, args);
		MyFirstClass myFirstClass = context.getBean("rohan",MyFirstClass.class);
		myFirstClass.displayMessage();

	}
// dependency Injection: configuration
}
