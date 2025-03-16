package com.example.sample_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {
    @GetMapping("/Flight")
    public String getData() {return "Please book your Flight from Indigo kindly book ticket for Mumbai in 50% discount" ; }
}

