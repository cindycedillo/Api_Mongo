/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mongodb.api_mongo.controller;

import com.mongodb.api_mongo.model.Serie;
import com.mongodb.api_mongo.service.SerieService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TUF Gaming
 */
@RestController
@RequestMapping("/api/series")
public class SerieController {
    
    @Autowired
    SerieService serieService;
    
    
     @GetMapping("/listar")
    public ResponseEntity<List<Serie>> listar() {
        return new ResponseEntity<>(serieService.findByAll(), HttpStatus.OK);
    }
    
     @GetMapping("/listarCodigo/{id}")
    public Serie encontrarCodigo(@PathVariable Long id) {
        return serieService.findById(id);
    }

    
    @PostMapping("/crear")
    public ResponseEntity<Serie> crearEstudiante(@RequestBody Serie persona) {
        return new ResponseEntity<>(serieService.save(persona), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Serie> eliminarEstudiante(@PathVariable Long id) {
        serieService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    
}
