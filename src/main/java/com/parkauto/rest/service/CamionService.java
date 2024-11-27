package com.parkauto.rest.service;

import com.parkauto.rest.entity.Camion;
import com.parkauto.rest.entity.Voiture;
import com.parkauto.rest.repository.ICamionRepository;
import com.parkauto.rest.repository.IVoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CamionService {

    @Autowired
    ICamionRepository camionRepository;

    //Liste des véhicules
    public List<Camion> getCamions() {
        return camionRepository.findAll();
    }

    public Camion saveCamions(Camion camion) {
        return camionRepository.save(camion);
    }

    public Camion findByIdCamion(Long  idCamion) {
        return camionRepository.findById(idCamion).get();
    }

    public void deleteCamion(Camion camion) {
         camionRepository.delete(camion);
    }
}
