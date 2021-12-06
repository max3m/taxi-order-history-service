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

    @GetMapping("/orders/{chainId}")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderMessage> findAllByChainId(@PathVariable("chainId") Long chainId) {
        return orderHistoryService.findAllByChainId(chainId);
    }

    @GetMapping("/orders")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderMessage> findAll() {
        return orderHistoryService.findAll();
    }
}
