package com.petervine.winerystore.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.petervine.winerystore.model.ProductType} entity
 */
@Data
public class ProductTypeDto implements Serializable {
    private final Integer id;
    private final String title;
}