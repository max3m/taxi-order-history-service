package com.epam.training.microservices.taxiorderservice.controller;

import com.epam.training.microservices.taxiorderservice.model.OrderMessage;
import com.epam.training.microservices.taxiorderservice.service.OrderHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class OrderHistoryController {
    private final OrderHistoryService orderHistoryService;

    @GetMapping("/orders/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderMessage> findAllById(@PathVariable("id") Long id) {
        return orderHistoryService.findAllById(id);
    }

    @GetMapping("/orders")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderMessage> findAll() {
        return orderHistoryService.findAll();
    }
}
