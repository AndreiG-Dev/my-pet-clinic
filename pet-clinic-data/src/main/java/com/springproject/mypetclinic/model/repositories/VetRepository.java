package com.springproject.mypetclinic.model.repositories;

import com.springproject.mypetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
