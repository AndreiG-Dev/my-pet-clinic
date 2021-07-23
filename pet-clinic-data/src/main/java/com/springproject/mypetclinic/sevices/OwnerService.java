package com.springproject.mypetclinic.sevices;

import com.springproject.mypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
