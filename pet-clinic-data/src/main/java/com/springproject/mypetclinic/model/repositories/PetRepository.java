package com.springproject.mypetclinic.model.repositories;

import com.springproject.mypetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
