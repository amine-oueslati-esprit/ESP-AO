package com.example.msra.Services;

import com.example.msra.DAO.Entities.GroupeA;
import com.example.msra.Services.Interfaces.IGroupeAService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.msra.DAO.Repositories.groupeARepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupeAService implements IGroupeAService {
    private final groupeARepo gRepo;


    @Override
    public GroupeA addGroupeA(GroupeA a) {
        return gRepo.save(a);
    }

    @Override
    public GroupeA findById(long id) {return gRepo.findById(id).get();
    }

    @Override
    public List<GroupeA> findAll() {
        return gRepo.findAll();
    }

    @Override
    public GroupeA updateGroupeA(GroupeA a) {
        return gRepo.save(a);
    }

    @Override
    public void deleteGroupeA(long id) {
        gRepo.deleteById(id);

    }

    @Override
    public void deleteGroupeA(GroupeA a) {
        gRepo.delete(a);

    }
}
