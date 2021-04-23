package com.example.backend.controllers;

import java.util.List;

import com.example.backend.models.update;
import com.example.backend.models.user;
import com.example.backend.services.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<user> index()
    {
        return userService.findAll();
    }

    @PostMapping("/valid")
    public Object validate(@RequestBody user usuario)
    {   
        return userService.findUser(usuario);
    }

    @PatchMapping("/update")
    public Object updateDesc(@RequestBody update obj) {
        
        return userService.updateDesc(obj);
        
    }

    // @PostMapping("/login")
    // public String validate(@RequestBody String username)
    // {
    //     if(username.username == "kalax")
    //     {
    //         return "OK" + username;
    //     }
    //     else{
    //         return "error" + username;
    //     }
        
    // }
    
}
