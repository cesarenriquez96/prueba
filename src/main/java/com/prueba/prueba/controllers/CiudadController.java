package com.prueba.prueba.controllers;

import com.prueba.prueba.models.CiudadModel;
import com.prueba.prueba.repositories.CiudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ciudades")
public class CiudadController {
    @Autowired
    CiudadRepository ciudadRepository;

    @GetMapping
    public List<CiudadModel> listarCiudades(){
        return ciudadRepository.findAll();
    }

    @PostMapping(value = "/insertar")
    public String insertarCiudad(@RequestBody CiudadModel ciudad){
        ciudadRepository.save(ciudad);
        return "Ciudad insertada";
    }

    @PutMapping(value = "/editarCiudad/{id}")
    public String editarCiudad(@RequestBody CiudadModel ciudad, @PathVariable Integer id){
        Optional<CiudadModel> editar = ciudadRepository.findById(id);

        return "Modificación realizada.";
    }

    @DeleteMapping(value = "/eliminar/{id}")
    public String eliminarCiudad(@PathVariable Integer id){
        try {
            ciudadRepository.deleteById(id);
            return "Ciudad eliminada.";
        } catch (Exception e){
            return "Error al eliminar la ciudad con id "+id;
        }
    }
}
