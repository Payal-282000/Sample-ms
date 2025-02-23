package com.example.sample_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotel {
    @GetMapping("/hotel")
    public String getData() {return "Please book your hotel ticket for Mumbai in 50% discount" ; }
}
