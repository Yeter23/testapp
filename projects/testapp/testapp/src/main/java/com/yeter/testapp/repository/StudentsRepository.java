package com.yeter.testapp.repository;

import com.yeter.testapp.entity.Students;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {
}
