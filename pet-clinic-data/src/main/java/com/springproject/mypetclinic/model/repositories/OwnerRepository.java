package com.springproject.mypetclinic.model.repositories;

import com.springproject.mypetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
