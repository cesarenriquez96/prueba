package com.prueba.prueba.repositories;

import com.prueba.prueba.models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Integer> {
}
