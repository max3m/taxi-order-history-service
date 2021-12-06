package com.epam.training.microservices.taxiorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableDiscoveryClient
@EnableKafka
public class TaxiOrderHistoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxiOrderHistoryServiceApplication.class, args);
    }
}
