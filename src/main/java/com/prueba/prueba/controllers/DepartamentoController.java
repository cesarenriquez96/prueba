package com.prueba.prueba.controllers;

import com.prueba.prueba.models.DepartamentoModel;
import com.prueba.prueba.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    DepartamentoRepository departamentoRepository;

    @GetMapping
    public List<DepartamentoModel> listarDepartamentos(){
        return departamentoRepository.findAll();
    }

}
