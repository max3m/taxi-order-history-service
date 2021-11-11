package com.epam.training.microservices.taxiorderservice.service;

import com.epam.training.microservices.taxiorderservice.model.OrderMessage;

import java.util.List;

public interface OrderHistoryService {
    void createOrUpdateOrder(OrderMessage orderMessage);
    List<OrderMessage> findAllById(Long id);
    List<OrderMessage> findAll();
}
