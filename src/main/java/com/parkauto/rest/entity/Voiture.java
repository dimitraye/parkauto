package com.parkauto.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Voiture")
public class Voiture extends Vehicule{
    @Column(name="immat")
    private String immatriculation;
    @Column(name="pwfiscale")
    private String puissanceFiscale;
    @Column(name="categorie")
    private String categorie;
    @Column(name="nbporte")
    private int nbPorte;
    @Column(name="poidstotal")
    private int poidsTotal;
    @Column(name="media")
    private String media;



}
