package com.example.UberReviewService.Models;

import jakarta.persistence.*;
import lombok.*;



@Entity // this annotation deals with java logic layer
@Getter
@Setter
@Builder
@NoArgsConstructor // associated with builder class
@AllArgsConstructor // associated with builder class
@Table(name = "booking_review") // this annotation deals with database layer
@Inheritance(strategy =  InheritanceType.JOINED)
public class Review extends  BaseModel{

    @Column(nullable = false)
    private String content;

    @Column
    double rating;


}
