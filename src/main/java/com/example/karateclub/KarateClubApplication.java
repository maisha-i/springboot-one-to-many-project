package com.example.karateclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class KarateClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarateClubApplication.class, args);
	}

}
