package com.yeter.testapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
public class Question {
    @Id
    @Column(name = " level_id")
    private int id;
    private String question;
    @ManyToOne()
    @JoinColumn(name = "level_id", referencedColumnName = "id")
    private Level level;
    @ManyToOne()
    @JoinColumn(name = "language_id", referencedColumnName = "id")
    private Language language;
    @ManyToOne()
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;
    @ManyToOne()
    @JoinColumn(name = "exam_id", referencedColumnName = "id")
    private Exam exam;
    @OneToMany(mappedBy = "question", cascade =  CascadeType.ALL)
    List<Variant> list=new ArrayList<>();
}


