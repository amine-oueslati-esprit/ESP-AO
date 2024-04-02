package com.example.msra.services;

import com.example.msra.repositories.actifRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActifService implements IActifService {
    private final com.example.msra.repositories.actifRepo actifRepo;

}