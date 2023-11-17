package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.puentes_puj.api.model.datos_tecnicos.DatosTecnicos;
import com.puentes_puj.api.model.datos_tecnicos.DatosTecnicosRepository;

public class DatosTecnicosController {
    
    @Autowired
    private DatosTecnicosRepository datosTecnicosRepository;

    // create datosTecnicos
    @CrossOrigin
    @PostMapping(value = "/datostecnicos/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createDatosTecnicos(@RequestBody DatosTecnicos newDatosTecnicos) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newDatosTecnicos.setId(null);
        DatosTecnicos savedDatosTecnicos = datosTecnicosRepository.save(newDatosTecnicos);
        return new ResponseEntity<>(savedDatosTecnicos.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
