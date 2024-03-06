package com.mvc.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    private Long id;
    
    private String password;
    private String name;
}
