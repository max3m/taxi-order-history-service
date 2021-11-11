package com.epam.training.microservices.taxiorderservice.service;

import com.epam.training.microservices.taxiorderservice.model.OrderMessage;
import com.epam.training.microservices.taxiorderservice.model.OrderStatus;
import com.epam.training.microservices.taxiorderservice.repository.OrderHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@AllArgsConstructor
public class DataInit implements ApplicationRunner {
    private final OrderHistoryRepository driverRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = driverRepository.count();

        if(count == 0) {
            for (int i = 0; i < 10; i++) {
                OrderMessage order = new OrderMessage();
                order.setUsername("Customer" + i);
                order.setDriverUsername("Driver" + i);
                order.setStatus(OrderStatus.CREATED);
                order.setInformation("Information" + i);
                order.setLocalDateTime(LocalDateTime.now());
                driverRepository.save(order);
            }
        }
    }
}
