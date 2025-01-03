package com.example.UberReviewService;

import com.example.UberReviewService.services.ReviewService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UberReviewServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UberReviewServiceApplication.class, args);

	}

}
