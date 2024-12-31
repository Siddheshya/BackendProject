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
@AllArgsConstructor // associated with builder class
@Table(name = "booking_review") // this annotation deals with database layer
@Inheritance(strategy =  InheritanceType.JOINED)
public class Review extends  BaseModel{

    @Column(nullable = false)
    private String content;

    @Column
    double rating;


}
