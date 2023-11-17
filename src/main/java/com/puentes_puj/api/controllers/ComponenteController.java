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

import com.puentes_puj.api.model.componente.Componente;
import com.puentes_puj.api.model.componente.ComponenteRepository;

@RestController
public class ComponenteController {
    @Autowired
    private ComponenteRepository componenteRepository;

    // create componente
    @CrossOrigin
    @PostMapping(value = "/componentes/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createApoyo(@RequestBody Componente newComponente) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newComponente.setId(null);
        Componente savedComponente = componenteRepository.save(newComponente);
        return new ResponseEntity<>(savedComponente.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }
}
