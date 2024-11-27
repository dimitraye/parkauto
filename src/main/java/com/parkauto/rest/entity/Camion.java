package com.parkauto.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="camion")
public class Camion extends Vehicule{

    @Override
    public String demarrer(){
        return "BRRRRRRRRR !!";
    }

    @Override
    public String accelerer(){
        return "BROUUMMMM !!";
    }

    public Camion() {
        super();
    }

    public Camion(Long matricule, int anneeModel, double prix) {
        super(matricule, anneeModel, prix);
    }

}
