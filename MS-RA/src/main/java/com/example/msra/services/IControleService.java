package com.example.msra.services;
import com.example.msra.entities.Controle;
import java.util.List;

public interface IControleService {
    Controle addControle(Controle x);
    Controle findById(long id);
    List<Controle> findAll();
    Controle updateControle(Controle x);
    void deleteControle(long id);
    void deleteControle(Controle x);
}
