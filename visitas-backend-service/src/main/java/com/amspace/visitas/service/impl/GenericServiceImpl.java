package com.amspace.visitas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amspace.visitas.domain.Company;
import com.amspace.visitas.domain.User;
import com.amspace.visitas.repository.CompanyRepository;
import com.amspace.visitas.repository.UserRepository;
import com.amspace.visitas.service.GenericService;

@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>)userRepository.findAll();
    }

    @Override
    public List<Company> findAllCompanies() {
        return (List<Company>)companyRepository.findAll();
    }
}
