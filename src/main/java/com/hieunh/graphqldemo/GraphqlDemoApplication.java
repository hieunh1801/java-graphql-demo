package com.hieunh.graphqldemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GraphqlDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(GraphqlDemoApplication.class, args);
		log.info("http://localhost:8080/graphql");
		log.info("http://localhost:8080/graphiql");
	}

}
