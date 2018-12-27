package com.tripathi.punit.petclinic.service;

import com.tripathi.punit.petclinic.model.Pet;

import java.util.Set;

public interface PetSetvice {

    Pet findById(long id);
    Pet save(Pet vet);
    Set<Pet> findAll();
}
