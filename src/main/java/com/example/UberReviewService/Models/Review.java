package com.example.UberReviewService.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Primary;

import javax.annotation.processing.Generated;

@Entity
public class Review {
    @Id
    long id;

}
