package com.yeter.testapp.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table

public class Students {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private String surname;
  private String gmail;
  private String phone;
  @OneToMany(mappedBy = "students", cascade =  CascadeType.ALL)
  List<Qeydiyyat> list=new ArrayList<>();


}
