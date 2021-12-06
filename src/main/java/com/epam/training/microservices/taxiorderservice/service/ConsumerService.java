package com.epam.training.microservices.taxiorderservice.service;

import com.epam.training.microservices.taxiorderservice.model.OrderMessage;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConsumerService {
    private final OrderHistoryService orderHistoryService;

    @KafkaListener(topics = "orderMessages", groupId = "message_group_id")
    public void consume(OrderMessage orderMessage){
        orderMessage.setId(null);
        orderHistoryService.createOrUpdateOrder(orderMessage);
        System.out.println("Consuming the message: " + orderMessage);
    }
}
