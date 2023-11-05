package com.wiki.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.wiki.api.model.puente.Puente;
import com.wiki.api.model.puente.PuenteRepository;

@RestController
public class PuenteController {

    @Autowired
    private PuenteRepository puenteRepository;

    // create puente
    @CrossOrigin
    @PostMapping(value = "/puentes/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createPuente(@RequestBody Puente puente) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        puente.setNombre("eds");
        Puente savedAdmin = puenteRepository.save(puente);
        return new ResponseEntity<>(savedAdmin.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(value = "/artists", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllArtists() throws Exception {
        List<Puente> artists = (List<Puente>) puenteRepository.findAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>(Puente.toJSONArray(artists).toString(), responseHeaders, HttpStatus.OK);
    }
    
}
