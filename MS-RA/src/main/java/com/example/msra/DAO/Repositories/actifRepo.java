package com.example.msra.DAO.Repositories;
import com.example.msra.DAO.Entities.Actif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface actifRepo extends JpaRepository<Actif, Long> {
}
