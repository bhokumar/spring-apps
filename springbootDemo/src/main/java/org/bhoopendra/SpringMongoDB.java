package org.bhoopendra;

import org.bhoopendra.mongo.config.CustomerRepository;
import org.bhoopendra.mongo.config.document.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoDB implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDB.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//customerRepository.deleteAll();
		customerRepository.save(new Customer("BHOOPENDRA", "8860634724"));
	}

}
