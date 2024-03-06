package com.petervine.winerystore.dto;

import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the {@link com.petervine.winerystore.model.Product} entity
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto implements Serializable {
    private Long id;
    private ProductTypeDto productType;
    private String title;
    private Double volume;
    private Integer year;
    private Double price;
    private Double alcoholPercentage;
    private GrapeSortDto grapeSort;
    private String description;
}