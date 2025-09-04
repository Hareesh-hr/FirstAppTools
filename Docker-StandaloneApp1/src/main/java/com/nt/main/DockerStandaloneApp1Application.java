package com.nt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerStandaloneApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerStandaloneApp1Application.class, args);
		System.out.println("=====Doker standalone application =====");
		System.out.println("Result is :: 30");
	}

}
