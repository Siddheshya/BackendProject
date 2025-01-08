package com.example.UberReviewService.adapters;

import com.example.UberReviewService.DTOs.CreateReviewDto;
import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Review;
import com.example.UberReviewService.repositories.BookingRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CreateReviewDtoToReviewAdapterImpl implements CreateReviewDtoToReviewAdapter{

    private BookingRepository bookingRepository;

    public CreateReviewDtoToReviewAdapterImpl(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Review convertDto(CreateReviewDto createReviewDto) {
        Optional<Booking> booking = bookingRepository.findById(createReviewDto.getBookingId());
        if(booking.isEmpty()) return null;
        Review review = Review.builder().booking(booking.get()).content(createReviewDto.getContent()).rating(createReviewDto.getRating()).build();
        return review;
    }
}
