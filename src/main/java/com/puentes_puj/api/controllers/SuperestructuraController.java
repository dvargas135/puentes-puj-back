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

import com.puentes_puj.api.model.superestructura.Superestructura;
import com.puentes_puj.api.model.superestructura.SuperestructuraRepository;

@RestController
public class SuperestructuraController {
    
    @Autowired
    private SuperestructuraRepository superestructuraRepository;

    // create superestructura
    @CrossOrigin
    @PostMapping(value = "/superestructuras/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createSuperestructura(@RequestBody Superestructura newSuperestructura) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newSuperestructura.setId(null);
        Superestructura savedSuperestructura = superestructuraRepository.save(newSuperestructura);
        return new ResponseEntity<>(savedSuperestructura.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
