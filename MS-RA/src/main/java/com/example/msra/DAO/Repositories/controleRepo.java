package com.example.msra.DAO.Repositories;

import com.example.msra.DAO.Entities.Controle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface controleRepo extends JpaRepository<Controle, Long> {
}
