package com.example.springboottutorial.controllers;

import com.example.springboottutorial.models.UsersModel;
import com.example.springboottutorial.repositories.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetUsersController {
    @Autowired
    private UsersRepo users_repository;

    @GetMapping(value = "/all_users")
    public List<UsersModel> getAllUsers(){
        return this.users_repository.findAll();
    }

    @GetMapping(value = "get_user")
    public List<UsersModel> getUser(@RequestParam String username){
        return this.users_repository.findUsersByName(username);
    }
}