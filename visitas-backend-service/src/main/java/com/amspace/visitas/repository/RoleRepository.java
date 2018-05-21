package com.amspace.visitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amspace.visitas.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
