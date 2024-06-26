package com.example.msra.Services.Interfaces;

import com.example.msra.DAO.Entities.Projet;

import java.util.List;

public interface IProjetService {
    Projet addProjet(Projet a);
    Projet findById(long id);
    List<Projet> findAll();
    Projet updateProjet(Projet a);
    void deleteProjet(long id);
    void deleteProjet(Projet a);

    void affecterGroupeAProjet(long idgroupea,long idprojet);
}
