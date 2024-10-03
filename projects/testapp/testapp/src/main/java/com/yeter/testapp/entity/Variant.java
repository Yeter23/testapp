package com.yeter.testapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Variant {
    @Column(name = "variants_id")
    private int id;

    private String variant;
    @ManyToOne()
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question question;
}
