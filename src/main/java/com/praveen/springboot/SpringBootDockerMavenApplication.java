package com.praveen.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDockerMavenApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDockerMavenApplication.class, args);
		System.out.println("Hello Praveen");
	}

}
