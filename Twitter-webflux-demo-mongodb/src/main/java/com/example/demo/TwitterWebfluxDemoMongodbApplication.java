package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class TwitterWebfluxDemoMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterWebfluxDemoMongodbApplication.class, args);
	}

}
