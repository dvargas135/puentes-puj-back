package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.puentes_puj.api.model.reparacion.Reparacion;
import com.puentes_puj.api.model.reparacion.ReparacionRepository;

public class ReparacionController {
    @Autowired
    private ReparacionRepository reparacionRepository;

    // create reparacion
    @CrossOrigin
    @PostMapping(value = "/reparaciones/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createApoyo(@RequestBody Reparacion newReparacion) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newReparacion.setId(null);
        Reparacion savedReparacion = reparacionRepository.save(newReparacion);
        return new ResponseEntity<>(savedReparacion.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
