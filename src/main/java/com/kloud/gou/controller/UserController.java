package com.kloud.gou.controller;

import com.kloud.gou.model.User;
import com.kloud.gou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping(value="/getAllUsers")
    public List<User> getAllUsers(){
        return userService.findAllUsers();
    }


}
