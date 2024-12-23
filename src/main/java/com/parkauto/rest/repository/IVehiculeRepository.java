package com.parkauto.rest.repository;

import com.parkauto.rest.entity.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {

}
