package com.example.backend.services;

import java.util.List;

import com.example.backend.models.update;
import com.example.backend.models.user;

public interface IUserService {

    public List<user> findAll();

    public Object findUser(user user);

    public Object updateDesc(update id);
    
}
