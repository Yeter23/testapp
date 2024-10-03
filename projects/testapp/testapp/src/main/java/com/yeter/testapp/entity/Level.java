package com.yeter.testapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data

public class Level {
    @Id
    @Column(name = "level_id")
    private int id;
    private String name;
    @OneToMany(mappedBy = "level", cascade =  CascadeType.ALL)
    List<Question> list=new ArrayList<>();
    @OneToMany(mappedBy = "level", cascade =  CascadeType.ALL)
    List<Exam> list=new ArrayList<>();
}
