package org.smartrobo.apps.securerobo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@EntityScan(basePackages = "org.smartrobo.apps.business")
@ComponentScan(basePackages = "org.smartrobo.apps")
@SpringBootApplication
public class SecureRoboApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureRoboApplication.class, args);
	}
}
