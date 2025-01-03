package com.example.UberReviewService.repositories;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long Id, String licenseNumber);

    List<Driver> findALlByIdIn(List<Long> driver_ids);

    @Query(nativeQuery = true, value = "Select * from Driver where id = :id AND license_number = :license")
    Optional<Driver> rawmfkdfmk(Long id, String license);
}
