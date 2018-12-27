package com.tripathi.punit.petclinic.service;

import com.tripathi.punit.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
