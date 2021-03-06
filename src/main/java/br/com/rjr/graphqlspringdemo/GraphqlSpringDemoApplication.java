package br.com.rjr.graphqlspringdemo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class GraphqlSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringDemoApplication.class, args);
	}
}
