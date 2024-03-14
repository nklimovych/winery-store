package com.petervine.winerystore.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column
    private Long id;
    @Column
    private LocalDateTime timeOfOrder;
    @OneToMany(mappedBy = "order")
    List<OrderItem> listOfOrderItems;
}
