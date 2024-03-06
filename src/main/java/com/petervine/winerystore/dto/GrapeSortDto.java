package com.petervine.winerystore.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.petervine.winerystore.model.GrapeSort} entity
 */
@Data
public class GrapeSortDto implements Serializable {
    private final Integer id;
    private final String sortName;
}