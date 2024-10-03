package com.yeter.testapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
public class Language {
@Column (name = "language_id")
    private int id ;
    private String name;
    @OneToMany(mappedBy = "language", cascade =  CascadeType.ALL)
    List<Question> list=new ArrayList<>();
    @OneToMany(mappedBy = "language", cascade =  CascadeType.ALL)
    List<Exam> list=new ArrayList<>();

}
