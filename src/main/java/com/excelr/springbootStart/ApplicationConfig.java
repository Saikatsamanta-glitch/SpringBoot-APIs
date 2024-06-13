package com.excelr.springbootStart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
	public MyFirstClass myFirstClass(){
		return new MyFirstClass("Rahul");
	}
	@Bean(name="rohan")
	public MyFirstClass mySecondClass(){
		return new MyFirstClass("Rohan");
	}
}
