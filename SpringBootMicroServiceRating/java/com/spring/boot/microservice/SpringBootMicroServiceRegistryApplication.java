package com.spring.boot.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootMicroServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServiceRegistryApplication.class, args);
	}

}
