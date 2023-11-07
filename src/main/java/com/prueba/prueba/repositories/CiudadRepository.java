package com.prueba.prueba.repositories;

import com.prueba.prueba.models.CiudadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<CiudadModel, Integer> {
}
