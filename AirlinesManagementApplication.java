package com.booking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.booking"})
//@EnableJpaAuditing
@EnableTransactionManagement
@SpringBootApplication
public class AirlinesManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesManagementApplication.class, args);
	}

}
