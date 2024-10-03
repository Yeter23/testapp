package com.yeter.testapp.repository;


import com.yeter.testapp.entity.Variant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariantsRepository extends JpaRepository<Variant,Integer> {
}
