package com.example.msra.Services.Interfaces;

import com.example.msra.DAO.Entities.GroupeA;
import java.util.List;

public interface IGroupeAService {
    GroupeA addGroupeA(GroupeA a);
    GroupeA findById(long id);
    List<GroupeA> findAll();
    GroupeA updateGroupeA(GroupeA a);
    void deleteGroupeA(long id);
    void deleteGroupeA(GroupeA a);
}
