package com.epam.training.microservices.taxiorderservice.service;

import com.epam.training.microservices.taxiorderservice.model.OrderMessage;

import java.util.List;

public interface OrderHistoryService {
    void createOrUpdateOrder(OrderMessage orderMessage);
    List<OrderMessage> findAllByChainId(Long chainId);
    List<OrderMessage> findAll();
}
