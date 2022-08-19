package com.idat.EFYaserQuinonezPizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EfYaserQuinonezPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfYaserQuinonezPizzaApplication.class, args);
	}

}
