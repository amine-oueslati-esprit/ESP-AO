package com.example.msra.DAO.Repositories;
import com.example.msra.DAO.Entities.GroupeA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface groupeARepo extends JpaRepository<GroupeA, Long> {

}
