package com.epam.training.microservices.taxiorderservice.service;

import com.epam.training.microservices.taxiorderservice.model.OrderMessage;
import com.epam.training.microservices.taxiorderservice.repository.OrderHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderHistoryServiceImpl implements OrderHistoryService {
    private final OrderHistoryRepository orderHistoryRepository;

    @Override
    public List<OrderMessage> findAllById(Long id) {
        return orderHistoryRepository.findAllById(id);
    }

    @Override
    public List<OrderMessage> findAll() {
        return orderHistoryRepository.findAll();
    }

    @Override
    public void createOrUpdateOrder(OrderMessage orderMessage) {
        orderHistoryRepository.save(orderMessage);
    }
}
