package com.example.UberReviewService.Models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity // this annotation deals with java logic layer
@Getter
@Setter
@Builder
@NoArgsConstructor // associated with builder class
@EntityListeners(AuditingEntityListener.class) // this annotation is providing a class to triggers when the below entity gets updated or created , it monitors the lifecyle of the entity
@AllArgsConstructor // associated with builder class
@Table(name = "bookingReview") // this annotation deals with database layer
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String content;


    double rating;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate // only handle it for object creation
    @Column(nullable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP) // this annotation will tell the format in which we want to store
    @Column(nullable = false)
    @LastModifiedDate   // only handle it when object modified
    private Date updatedAt;

}
