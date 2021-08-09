package com.currentAccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceCurrentAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCurrentAccountApplication.class, args);
	}

}
