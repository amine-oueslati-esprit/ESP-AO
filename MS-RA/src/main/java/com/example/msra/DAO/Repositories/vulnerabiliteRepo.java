package com.example.msra.DAO.Repositories;

import com.example.msra.DAO.Entities.Vulnerabilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface vulnerabiliteRepo extends JpaRepository<Vulnerabilite, Long> {
}
