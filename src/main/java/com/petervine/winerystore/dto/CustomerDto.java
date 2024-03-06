package com.petervine.winerystore.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.petervine.winerystore.model.Customer} entity
 */
@Data
public class CustomerDto implements Serializable {
    private final Long id;
    private final String name;
    private final String surname;
    private final String email;
    private final String phoneNumber;
    private final String companyName;
    private final String deliveryType;
    private final String deliveryAddress;
}