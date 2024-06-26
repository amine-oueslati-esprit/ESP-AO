package com.example.msra.Services;

import com.example.msra.DAO.Entities.Controle;
import com.example.msra.DAO.Repositories.controleRepo;
import com.example.msra.Services.Interfaces.IControleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ControleService implements IControleService {
    private final controleRepo cRepo;


    @Override
    public Controle addControle(Controle x) { return cRepo.save(x);
    }

    @Override
    public Controle findById(long id) {
        return cRepo.findById(id).get();
    }

    @Override
    public List<Controle> findAll() {
        return cRepo.findAll();
    }

    @Override
    public Controle updateControle(Controle x) {
        return cRepo.save(x);
    }

    @Override
    public void deleteControle(long id) { cRepo.deleteById(id);    }

    @Override
    public void deleteControle(Controle x) { cRepo.delete(x);    }
}