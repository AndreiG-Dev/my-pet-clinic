package com.springproject.mypetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="pets")
public class Pet extends BaseEntity{

    private PetType petType;

    @ManyToOne
    @JoinColumn( name = "owner_id")
    private Owner owner;

    @Column(name="birth_date")
    private LocalDate birthDate;

    @Column( name = "name")
    private String name;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
