package com.example.msra.repositories;

import com.example.msra.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface scenarioRepo extends JpaRepository<Scenario, Long> {
}