package com.yeter.testapp.repository;

import com.yeter.testapp.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultsRepository extends JpaRepository<Results,Integer> {
}
