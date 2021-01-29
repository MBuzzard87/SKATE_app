package com.example.skate_app.controller;

import com.example.skate_app.model.User;
import com.example.skate_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/add")
    @ResponseBody
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @GetMapping("/userlist")
    @ResponseBody
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<User> findUserById(@PathVariable("id") Long userId) {
        return userService.findUserById(userId);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }



}
