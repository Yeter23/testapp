package com.yeter.testapp.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
public class Exam {
    private int id;
    @ManyToOne()
    @JoinColumn(name = "level_id", referencedColumnName = "id")
    private Level level;
    @ManyToOne()
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;
    @ManyToOne()
    @JoinColumn(name = "language_id", referencedColumnName = "id")
    private Language language;
    @OneToMany(mappedBy = "exam", cascade =  CascadeType.ALL)
    List<Question> list=new ArrayList<>();



}
