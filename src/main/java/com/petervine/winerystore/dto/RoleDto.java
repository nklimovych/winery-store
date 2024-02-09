package com.petervine.winerystore.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.petervine.winerystore.model.Role}
 */
@Value
public class RoleDto implements Serializable {
    Long id;
    @NotBlank(message = "The 'authority' cannot be empty")
    String authority;
}