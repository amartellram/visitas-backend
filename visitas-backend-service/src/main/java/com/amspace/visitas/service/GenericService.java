package com.amspace.visitas.service;

import java.util.List;

import com.amspace.visitas.domain.Company;
import com.amspace.visitas.domain.User;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<Company> findAllCompanies();
}
