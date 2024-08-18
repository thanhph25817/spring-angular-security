package com.example.springangular;

import com.example.springangular.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;

@SpringBootApplication
@EnableJpaAuditing
public class SpringAngularApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularApiApplication.class, args);
		User usser = new User().email("abce")
				.dateOfBirth(LocalDate.now())
				.enable(true);
		System.out.println("hello abc");
		System.out.println("hello world");
	}

}
