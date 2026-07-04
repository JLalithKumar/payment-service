package com.example.payment_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @GetMapping("/")
    public String home() {
        return "Payment Service is Running!";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/payments")
    public List<Payment> getPayments() {

        return List.of(
                new Payment(1, 500.0, "SUCCESS"),
                new Payment(2, 1200.0, "PENDING"),
                new Payment(3, 250.0, "FAILED")
        );
    }
}