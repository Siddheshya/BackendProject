package com.example.UberReviewService.services;

import com.example.UberReviewService.Models.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    public Optional<Review> findReviewById(Long id);

    public List<Review> findAllReviews();

    public boolean deleteReviewById(Long Id);

    public Review publishReview(Review review);
}
