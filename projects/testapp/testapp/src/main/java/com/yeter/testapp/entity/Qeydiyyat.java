package com.yeter.testapp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table

public class Qeydiyyat {
    @Id

    private int id;
    @ManyToOne()
    @JoinColumn(name = "students_id", referencedColumnName = "id")
    private Students students;

}
