package com.springproject.mypetclinic.sevices.map;

import com.springproject.mypetclinic.model.Owner;
import com.springproject.mypetclinic.sevices.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService <Owner, Long> implements OwnerService  {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
