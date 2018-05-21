package com.amspace.visitas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amspace.visitas.domain.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
