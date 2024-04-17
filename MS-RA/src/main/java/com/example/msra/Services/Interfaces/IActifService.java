package com.example.msra.Services.Interfaces;

import com.example.msra.DAO.Entities.Actif;
import java.util.List;

public interface IActifService {
    Actif addActif(Actif a);
    Actif findById(long id);
    List<Actif> findAll();
    Actif updateActif(Actif a);
    void deleteActif(long id);
    void deleteActif(Actif a);
}