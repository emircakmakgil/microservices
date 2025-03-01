package com.turkcell.orderservice.controller;

import com.turkcell.orderservice.client.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final ProductClient productClient;

    public OrderController(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping
    public String get(){
        String response = productClient.get();
        System.out.println(response);

        return "ORDER SERVICE";
    }
}
