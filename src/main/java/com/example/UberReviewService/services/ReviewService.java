package com.example.UberReviewService.services;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import com.example.UberReviewService.repositories.BookingRepository;
import com.example.UberReviewService.repositories.DriverRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {
    @Autowired
    DriverRepository driverRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Override
    @Transactional
    public void run(String... args) throws Exception {
        List<Long> driver_ids = new ArrayList<>(Arrays.asList(1L,2L,3L,4L));
        List<Driver> drivers = driverRepository.findALlByIdIn(driver_ids);
//        List<Booking> bookings = bookingRepository.findAllByDriverIn(drivers);
        for(Driver d:drivers){
            System.out.println(d.getBookings().size());
//            bookings.forEach(booking -> System.out.println(booking.getId()));
        }
//        if(driver.isPresent()){
//            System.out.println(driver.get().getName());
//            List<Booking> b = driver.get().getBookings();
//            for(Booking booking:b){
//                System.out.println(booking.getId());
//            }
//        }

    }
}
