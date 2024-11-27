package com.parkauto.rest.controller;

import com.parkauto.rest.entity.Voiture;
import com.parkauto.rest.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("*")
public class VoitureController {

    @Autowired
    VoitureService voitureService;

    @PostMapping("/voitures")
    public Voiture createVoiture(@Validated @RequestBody(required = false)Voiture voiture) {
        return voitureService.saveVoiture(voiture);
    }

    @GetMapping("/voitures}")
    public List<Voiture> getAllVoitures(@Validated @RequestBody(required = false)Voiture voiture) {
        return voitureService.getVoitures();
    }

    @GetMapping("/voitures/{idVoiutre}")
    public ResponseEntity getVoituresById(@PathVariable(name = "idVoiture")Long idVoiture) {
        if (idVoiture == null) {
           return ResponseEntity.badRequest().body("Cannot retrieve voiture with null id");
        }
        Voiture voit = voitureService.findByIdVoiture(idVoiture);
        if (voit == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/voitures/{id}")
    public ResponseEntity<Voiture>  deleteVoiture(@PathVariable(name = "idVoiture")Long idVoiture) {
        Voiture voit = voitureService.findByIdVoiture(idVoiture);
        if (voit == null) {
            return ResponseEntity.notFound().build();
        }
        voitureService.deleteVoiture(voit);
        return ResponseEntity.ok().body(voit);
    }






}
