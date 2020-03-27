package org.kavus.one;

import org.kavus.one.repo.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}
	@Bean
	CommandLineRunner demo(AnimalRepository animRepo){
		return args -> {
			System.out.println("Everything is fine.");
		};
	}
}
