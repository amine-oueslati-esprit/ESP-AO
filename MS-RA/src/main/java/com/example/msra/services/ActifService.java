package com.example.msra.services;

import com.example.msra.entities.Actif;
import com.example.msra.repositories.actifRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActifService implements IActifService {
    private final actifRepo aRepo;

    @Override
    public Actif addActif(Actif a) {
        return aRepo.save(a);
    }

    @Override
    public Actif findById(long id) {

        return aRepo.findById(id).get();
    }

    @Override
    public List<Actif> findAll() {
        return aRepo.findAll();
    }

    @Override
    public Actif updateActif(Actif a) {
        return aRepo.save(a);
    }

    @Override
    public void deleteActif(long id) {
        aRepo.deleteById(id);

    }

    @Override
    public void deleteActif(Actif a) {
        aRepo.delete(a);

    }
}