package com.yeter.testapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table
public class Subject {
    @Id

@Column(name = "subject_id")
    private  int id;
    private String subject;

    @OneToMany(mappedBy = "subject", cascade =  CascadeType.ALL)
    List<Question> list=new ArrayList<>();

    @OneToMany(mappedBy = "subject", cascade =  CascadeType.ALL)
    List<Exam> list=new ArrayList<>();

}
