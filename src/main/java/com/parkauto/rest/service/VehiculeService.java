package com.parkauto.rest.service;

import com.parkauto.rest.entity.Vehicule;
import com.parkauto.rest.repository.IVehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService {

    @Autowired
    IVehiculeRepository vehiculeRepository;

    //Liste des véhicules
    public List<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
    }

    public Vehicule saveVehicules(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    public Vehicule findByIdVehicule(Long  idVehicule) {
        return vehiculeRepository.findById(idVehicule).get();
    }

    public void deleteVehicule(Vehicule vehicule) {
         vehiculeRepository.delete(vehicule);
    }
}
