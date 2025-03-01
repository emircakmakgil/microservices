package com.turkcell.orderservice.controller;

import com.turkcell.orderservice.client.ProductClient;
import com.turkcell.orderservice.entity.Order;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final ProductClient productClient;
    private final StreamBridge streamBridge;

    public OrderController(ProductClient productClient, StreamBridge streamBridge) {
        this.productClient = productClient;
        this.streamBridge = streamBridge;
    }

    @GetMapping
    public String get(){
        //String response = productClient.get();
        //System.out.println(response);

        //kafkaya bir mesaj göndermek istiyorum
        Order order = new Order();
        order.setId("abc123");
        streamBridge.send("orderCreatedFunction-out-0","mesaj123"); //bindingdeki ismi önemli
        return "ORDER SERVICE";
    }
}
