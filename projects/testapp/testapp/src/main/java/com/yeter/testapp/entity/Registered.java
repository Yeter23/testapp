package com.yeter.testapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Registered {
    @Column(name = "registered_id")
    private int id;
    private String username;
    private String password;
    private int role;

}
