package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers(){
        User user = new User();

        user.setId(1);
        user.setName("xyz");

        User user1 = new User();

        user1.setId(2);
        user1.setName("abc");

        List<User>  users = new ArrayList<>();

        users.add(user);
        users.add(user1);
        return  users;

    }
    @GetMapping("/user/{id}/{name}")
    public User getUser(@PathVariable int id,@PathVariable String name){
    User user = new User();

        user.setId(id);
        user.setName(name);
        return user;

    }
    @PostMapping("/users")
    public void save(@RequestBody User user){
        System.out.println("user:"+ user.getName());

    }

    @DeleteMapping ("/user/{id}")
    public void deleteUser(@PathVariable int id){
        System.out.println("delete called!");
        User user = new User();

        user.setId(id);

    }

    @PutMapping ("/users")
    public void updateUser(@RequestBody User user){
        System.out.println("put called!");
        System.out.println("user:"+ user.getName());

    }


}
