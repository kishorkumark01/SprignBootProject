package com.example.demoSpring;

import jakarta.persistence.Entity;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
@EntityScan(basePackages = "com.example.demoSpring.college.shre.entity")
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);
	}

}
