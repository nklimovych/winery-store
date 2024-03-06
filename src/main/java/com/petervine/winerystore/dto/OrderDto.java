package com.petervine.winerystore.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * A DTO for the {@link com.petervine.winerystore.model.Order} entity
 */
@Data
public class OrderDto implements Serializable {
    private final Long id;
    private final LocalDateTime timeOfOrder;
    private final Double totalSum;
    private final Set<ProductDto> productSet;
}