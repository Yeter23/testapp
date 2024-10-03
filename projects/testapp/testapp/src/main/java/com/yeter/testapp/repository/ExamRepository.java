package com.yeter.testapp.repository;

import com.yeter.testapp.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,Integer> {
}
