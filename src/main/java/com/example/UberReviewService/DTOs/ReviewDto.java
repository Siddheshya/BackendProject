package com.example.UberReviewService.DTOs;


import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    private long id;

    private String content;

    private Double rating;

    private long booking;

    private Date createdAt;

    private Date updatedAt;
}
