package com.example.UberReviewService.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel{


    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startingTime;

    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Passenger passenger;
}
