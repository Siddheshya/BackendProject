package com.example.UberReviewService.controllers;

import com.example.UberReviewService.DTOs.CreateReviewDto;
import com.example.UberReviewService.DTOs.ReviewDto;
import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.adapters.CreateReviewDtoToReviewAdapter;
import com.example.UberReviewService.services.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private ReviewService reviewService;

    private CreateReviewDtoToReviewAdapter createReviewDtoToReviewAdapter;

    public ReviewController(ReviewService reviewService, CreateReviewDtoToReviewAdapter createReviewDtoToReviewAdapter){
        this.reviewService = reviewService;
        this.createReviewDtoToReviewAdapter = createReviewDtoToReviewAdapter;
    }

    @PostMapping
    public ResponseEntity<?> ResponseEntity(@Validated @RequestBody CreateReviewDto request){
        Review review = this.reviewService.publishReview(this.createReviewDtoToReviewAdapter.convertDto(request));
        if(review == null){
            return null;
        }
        ReviewDto response = ReviewDto.builder().id(review.getId()).content(review.getContent()).rating(review.getRating()).id(review.getId()).createdAt(review.getCreatedAt()).updatedAt(review.getUpdatedAt()).booking(review.getBooking().getId()).build();
        return new ResponseEntity<ReviewDto>(response, HttpStatus.CREATED);
    }
}
