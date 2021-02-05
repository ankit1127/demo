package com.example.demo.entity;

import javax.persistence.*;

@Entity
//@Table(name = "")
public class User {

    //used to map variable as primary key

    @Id
// used to define generation id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    // used to define column property
    //@Column
    private String firstName;
    private String lastName;

    public User() {}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



}
