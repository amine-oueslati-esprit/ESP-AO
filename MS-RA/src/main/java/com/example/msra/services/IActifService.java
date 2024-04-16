package com.example.msra.services;

import com.example.msra.entities.Actif;
import java.util.List;

public interface IActifService {
    Actif addActif(Actif a);
    Actif findById(long id);
    List<Actif> findAll();
    Actif updateActif(Actif a);
    void deleteActif(long id);
    void deleteActif(Actif a);

}