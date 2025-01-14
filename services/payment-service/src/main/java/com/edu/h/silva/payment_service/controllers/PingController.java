package com.edu.h.silva.payment_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/")
	public String index() {
		return "Payment service on";
	}
}
