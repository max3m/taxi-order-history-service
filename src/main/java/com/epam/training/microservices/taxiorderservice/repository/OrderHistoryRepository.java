package com.epam.training.microservices.taxiorderservice.repository;

import com.epam.training.microservices.taxiorderservice.model.OrderMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderHistoryRepository extends JpaRepository<OrderMessage, Long> {
    List<OrderMessage> findAllByChainId(Long ChainId);
}
