package com.danielcruz.simplerestapi.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
            Student daniel = new Student(
				"Daniel",
				"daniel@gmail.com",
				LocalDate.of(2000, Month.AUGUST, 8)
			);
            Student laura = new Student(
				"Laura",
				"laura@gmail.com",
				LocalDate.of(2001, Month.DECEMBER, 14)
			);
            
            repository.saveAll(
        		List.of( daniel, laura )
    		);
		};
	}
}
