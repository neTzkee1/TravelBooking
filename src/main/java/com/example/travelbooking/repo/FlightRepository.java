package com.example.travelbooking.repo;

import com.example.travelbooking.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestinationAndDepartureDate(String source, String destination, Date departureDate);
}

