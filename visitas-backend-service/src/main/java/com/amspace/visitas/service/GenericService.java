package com.amspace.visitas.service;

import java.util.List;

import com.amspace.visitas.domain.RandomCity;
import com.amspace.visitas.domain.User;

public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}
