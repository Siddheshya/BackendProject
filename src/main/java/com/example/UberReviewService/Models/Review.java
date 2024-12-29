package com.example.UberReviewService.Models;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity // this annotation deals with java logic layer
@Table(name = "bookingReview") // this annotation deals with database layer
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    String content;


    double rating;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate // only handle it for object creation
    @Column(nullable = false)
    Date createdAt;

    @Temporal(TemporalType.TIMESTAMP) // this annotation will tell the format in which we want to store
    @Column(nullable = false)
    @LastModifiedDate   // only handle it when object modified
    Date updatedAt;

}
