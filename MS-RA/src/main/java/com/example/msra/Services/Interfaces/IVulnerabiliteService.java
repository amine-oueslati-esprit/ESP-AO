package com.example.msra.Services.Interfaces;

import com.example.msra.DAO.Entities.Vulnerabilite;

import java.util.List;

public interface IVulnerabiliteService {
    Vulnerabilite addVulnerabilite(Vulnerabilite x);
    Vulnerabilite findById(long id);
    List<Vulnerabilite> findAll();
    Vulnerabilite updateVulnerabilite(Vulnerabilite x);
    void deleteVulnerabilite(long id);
    void deleteVulnerabilite(Vulnerabilite x);
}
