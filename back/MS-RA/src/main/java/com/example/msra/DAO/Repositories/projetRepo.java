package com.example.msra.DAO.Repositories;
import com.example.msra.DAO.Entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface projetRepo extends JpaRepository<Projet, Long>{
}
