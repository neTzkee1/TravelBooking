package com.example.travelbooking.service;

import com.example.travelbooking.entities.Flight;
import com.example.travelbooking.repo.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> searchFlights(String source, String destination, Date departureDate) {
        return flightRepository.findBySourceAndDestinationAndDepartureDate(source, destination, departureDate);
    }

    // Other flight-related methods...
}
