package com.example.travelbooking.controllers;

import com.example.travelbooking.entities.Flight;
import com.example.travelbooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping
    public ResponseEntity<List<Flight>> searchFlights(@RequestParam("source") String source,
                                                      @RequestParam("destination") String destination,
                                                      @RequestParam("departureDate") Date departureDate) {
        List<Flight> flights = flightService.searchFlights(source, destination, departureDate);

        if (flights.isEmpty()) {
            return ResponseEntity.noContent().build(); // Return 204 No Content
        } else {
            return ResponseEntity.ok(flights); // Return 200 OK with the list of flights
        }
    }

    // Other flight-related controller methods...
}

