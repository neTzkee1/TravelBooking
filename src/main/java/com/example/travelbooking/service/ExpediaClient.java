package com.example.travelbooking.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.util.Date;

//@Service
//public class ExpediaClient {
//    private final RestTemplate restTemplate;
//    private final String apiKey;
//
//    public ExpediaClient(RestTemplate restTemplate, @Value("${expedia.api.key}") String apiKey) {
//        this.restTemplate = restTemplate;
//        this.apiKey = apiKey;
//    }
//
//    public ExpediaResponse searchFlights(String source, String destination, Date departureDate) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer " + apiKey);
//
//        // Build the request URL with query parameters
//        String url = "https://api.expedia.com/v1/flights?source=" + source + "&destination=" + destination + "&departureDate=" + departureDate;
//
//        // Make the HTTP request and parse the response
//        ResponseEntity<ExpediaResponse> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), ExpediaResponse.class);
//        return response.getBody();
//    }
//}
