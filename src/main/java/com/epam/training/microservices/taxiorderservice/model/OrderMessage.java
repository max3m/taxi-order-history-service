package com.epam.training.microservices.taxiorderservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class OrderMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String driverUsername;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private String information;
    private LocalDateTime localDateTime;

    public OrderMessage(OrderMessage orderMessage) {
        this.id = orderMessage.getId();
        this.username = orderMessage.getUsername();
        this.driverUsername = orderMessage.getDriverUsername();
        this.status = orderMessage.getStatus();
        this.information = orderMessage.getInformation();
        this.localDateTime = LocalDateTime.now();
    }
}
