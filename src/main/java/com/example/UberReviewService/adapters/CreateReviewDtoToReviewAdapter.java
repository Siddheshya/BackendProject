package com.example.UberReviewService.adapters;

import com.example.UberReviewService.DTOs.CreateReviewDto;
import com.example.UberReviewService.Models.Review;

public interface CreateReviewDtoToReviewAdapter {

    public Review convertDto(CreateReviewDto createReviewDto);

}
