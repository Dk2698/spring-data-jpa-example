package com.kumar.jpa;

import com.github.javafaker.Faker;
import com.kumar.jpa.models.Author;
import com.kumar.jpa.models.Video;
import com.kumar.jpa.repositories.AuthorRepository;
import com.kumar.jpa.repositories.VideoRepository;
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
			AuthorRepository repository,
			VideoRepository videoRepository
	){
		return args ->{
//			var author = Author.builder()
//					.firstName("D")
//					.lastName("Kumar")
//					.age(25)
//					.email("test@nomail.com")
//					.build();
//			repository.save(author);
//			var video = Video.builder()
//					.name("abc")
//					.length(5)
//					.build();
//			videoRepository.save(video);

//			for (int i = 0; i < 50; i++) {
//				Faker faker = new Faker();
//				var author = Author.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(19,50))
//						.email("test"+ i+ "@nomail.com")
//						.build();
//				repository.save(author);
//			}

			// update author with ID = 1
//			var author = Author.builder()
//					.id(1)
//					.firstName("Kumar")
//					.lastName("D")
//					.age(26)
//					.email("kumar@nomail.com")
//					.build();
//			repository.save(author);

			// update Author a set a.age = 22 where a.id = 1

			repository.updateAuthor(23, 1);

			// find by named query
			repository.findByNamedQuery(20)
					.forEach((author)->System.out.println(author.getFirstName()));
		};
	}
}
