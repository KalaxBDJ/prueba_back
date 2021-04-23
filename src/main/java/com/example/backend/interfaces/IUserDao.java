package com.example.backend.interfaces;

import com.example.backend.models.user;

import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<user, Long> {
    
}
