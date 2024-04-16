package com.example.msra.services;

import com.example.msra.entities.Controle;
import com.example.msra.repositories.controleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ControleService implements IControleService {
    private final controleRepo cRepo;


    @Override
    public Controle addControle(Controle x) {
        return null;
    }

    @Override
    public Controle findById(long id) {
        return null;
    }

    @Override
    public List<Controle> findAll() {
        return null;
    }

    @Override
    public Controle updateControle(Controle x) {
        return null;
    }

    @Override
    public void deleteControle(long id) {

    }

    @Override
    public void deleteControle(Controle x) {

    }
}
