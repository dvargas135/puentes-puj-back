package com.puentes_puj.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.puentes_puj.api.model.detalle.Detalle;
import com.puentes_puj.api.model.detalle.DetalleRepository;

@RestController
public class DetalleController {
    
    @Autowired
    private DetalleRepository detalleRepository;

    // create detalle
    @CrossOrigin
    @PostMapping(value = "/detalles/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createDetalle(@RequestBody Detalle newDetalle) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newDetalle.setId(null);
        Detalle savedDetalle = detalleRepository.save(newDetalle);
        return new ResponseEntity<>(savedDetalle.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
