package org.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		start();
	}

	public static void start(){
		SpringApplication.run(RestApplication.class);
	}

	public static void stop(){

	}
}
