package com.example;

import com.example.entity.AppUser;
import com.example.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ApplicationMain {

	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void init() {
		repository.saveAll(Stream.of(new AppUser(101, "Pratik", "se", "p@gmail.com"), new AppUser(102, "Dileep", "se", "d@gmail.com"),
						new AppUser(103, "Lav", "se", "l@gmail.com"), new AppUser(104, "Swat", "se", "s@gmail.com"))
				.collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}
}
