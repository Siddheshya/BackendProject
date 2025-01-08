package com.example.UberReviewService.repositories;

import com.example.UberReviewService.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

    Integer countAllByRatingIsLessThanEqual(Integer givenRating);

    List<Review> findALlByRatingIsLessThanEqual(Integer givenRating);

    List<Review> findAllByCreatedAtBefore(Date date);

//    @Query("select r from Booking b inner join Review r on b.review = r where b.id = :bookingId")
//    Review findReviewByBookingId(Long bookingId);
}
