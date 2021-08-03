package com.springproject.mypetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialities() {
        return specialties;
    }

    public void setSpecialities(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
