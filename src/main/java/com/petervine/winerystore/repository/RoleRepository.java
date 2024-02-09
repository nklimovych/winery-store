package com.petervine.winerystore.repository;

import com.petervine.winerystore.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
