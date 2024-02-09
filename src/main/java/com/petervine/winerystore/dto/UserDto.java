package com.petervine.winerystore.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link com.petervine.winerystore.model.User}
 */
@Data
@Builder
public class UserDto implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RoleDto role;

    public UserDto(Long id, String firstName, String lastName, String email, String password, RoleDto role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public UserDto() {
    }
}