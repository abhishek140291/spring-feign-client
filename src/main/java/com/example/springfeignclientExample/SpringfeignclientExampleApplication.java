package com.example.springfeignclientExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringfeignclientExampleApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringfeignclientExampleApplication.class, args);
	}

}
