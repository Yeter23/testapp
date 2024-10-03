package com.yeter.testapp.repository;

import com.yeter.testapp.entity.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisteredRepository extends JpaRepository<Registered,Integer> {
}
