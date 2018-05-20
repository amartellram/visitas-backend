package com.amspace.visitas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.amspace.visitas.domain.User;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
