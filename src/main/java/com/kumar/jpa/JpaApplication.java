package com.kumar.jpa;

import com.kumar.jpa.models.Author;
import com.kumar.jpa.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	){
		return args ->{
			var author = Author.builder()
					.firstName("D")
					.lastName("Kumar")
					.age(25)
					.email("test@nomail.com")
					.build();
			repository.save(author);
		};
	}
}
