package com.yeter.testapp.repository;

import com.yeter.testapp.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelRepository extends JpaRepository<Level,Integer> {
}
