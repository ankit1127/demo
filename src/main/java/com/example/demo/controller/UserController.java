package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home(){
        return "home page";
    }

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

        // select * from user where id = :id
       com.example.demo.entity.User dbUser = userRepository.findByIdAndFirstName((long) id,name);
               //userRepository.findById((long) id).orElse(null);

        Long countUsers = userRepository.countUsers();
        System.out.println(countUsers);
    User user = new User();

        user.setId(dbUser.getId().intValue());
        user.setName(dbUser.getFirstName());
        user.setLastName(dbUser.getLastName());
        return user;

    }
    @PostMapping("/users")
    public void save(@RequestBody User user){
        System.out.println("user:"+ user.getName());
        com.example.demo.entity.User dbUser = new com.example.demo.entity.User(user.getName(),user.getLastName());
        userRepository.save(dbUser);

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
