package com.example.msra.Services;

import com.example.msra.DAO.Entities.Vulnerabilite;
import com.example.msra.Services.Interfaces.IVulnerabiliteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.msra.DAO.Repositories.vulnerabiliteRepo;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VulnerabiliteService implements IVulnerabiliteService {
    private final vulnerabiliteRepo vRepo;

    @Override
    public Vulnerabilite addVulnerabilite(Vulnerabilite x) { return vRepo.save(x);
    }

    @Override
    public Vulnerabilite findById(long id) {
        return vRepo.findById(id).get();
    }

    @Override
    public List<Vulnerabilite> findAll() {
        return vRepo.findAll();
    }

    @Override
    public Vulnerabilite updateVulnerabilite(Vulnerabilite x) {
        return vRepo.save(x);
    }

    @Override
    public void deleteVulnerabilite(long id) { vRepo.deleteById(id);    }

    @Override
    public void deleteVulnerabilite(Vulnerabilite x) { vRepo.delete(x);    }
}