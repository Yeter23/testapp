package com.yeter.testapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Results {
    @Id
    @Column(name=" level_id")
    private int id;
    private String question;

    private  Level level ;

}
