package com.puentes_puj.api.model.apoyo;

import java.util.Iterator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

public class Apoyo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fijo_sobre_estribo;
    private String movil_sobre_estribo;
    private String fijo_en_pila;
    private String movil_en_pila;
    private String fijo_en_viga;
    private String movil_en_viga;
    private String vehiculo_disenio;
    private String clase_distribucion_carga;
    private Long puenteid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFijo_sobre_estribo() {
        return fijo_sobre_estribo;
    }

    public void setFijo_sobre_estribo(String fijo_sobre_estribo) {
        this.fijo_sobre_estribo = fijo_sobre_estribo;
    }

    public String getMovil_sobre_estribo() {
        return movil_sobre_estribo;
    }

    public void setMovil_sobre_estribo(String movil_sobre_estribo) {
        this.movil_sobre_estribo = movil_sobre_estribo;
    }

    public String getFijo_en_pila() {
        return fijo_en_pila;
    }

    public void setFijo_en_pila(String fijo_en_pila) {
        this.fijo_en_pila = fijo_en_pila;
    }

    public String getMovil_en_pila() {
        return movil_en_pila;
    }

    public void setMovil_en_pila(String movil_en_pila) {
        this.movil_en_pila = movil_en_pila;
    }

    public String getFijo_en_viga() {
        return fijo_en_viga;
    }

    public void setFijo_en_viga(String fijo_en_viga) {
        this.fijo_en_viga = fijo_en_viga;
    }

    public String getMovil_en_viga() {
        return movil_en_viga;
    }

    public void setMovil_en_viga(String movil_en_viga) {
        this.movil_en_viga = movil_en_viga;
    }

    public String getVehiculo_disenio() {
        return vehiculo_disenio;
    }

    public void setVehiculo_disenio(String vehiculo_disenio) {
        this.vehiculo_disenio = vehiculo_disenio;
    }

    public String getClase_distribucion_carga() {
        return clase_distribucion_carga;
    }

    public void setClase_distribucion_carga(String clase_distribucion_carga) {
        this.clase_distribucion_carga = clase_distribucion_carga;
    }

    public Long getPuenteid() {
        return puenteid;
    }

    public void setPuenteid(Long puenteid) {
        this.puenteid = puenteid;
    }
    
    public JSONObject toJSON() throws Exception {
        JSONObject japplication = new JSONObject();
        japplication.put("id", getId());
        japplication.put("fijo_sobre_estribo", getFijo_sobre_estribo());
        japplication.put("movil_sobre_estribo", getMovil_sobre_estribo());
        japplication.put("fijo_en_pila", getFijo_en_pila());
        japplication.put("movil_en_pila", getMovil_en_pila());
        japplication.put("fijo_en_viga", getFijo_en_viga());
        japplication.put("movil_en_viga", getMovil_en_viga());
        japplication.put("vehiculo_disenio", getVehiculo_disenio());
        japplication.put("clase_distribucion_carga", getClase_distribucion_carga());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Apoyo> apoyos ) throws Exception {
		JSONArray japoyos = new JSONArray();
        Iterator<Apoyo> iapoyos = apoyos.iterator();
        while(iapoyos.hasNext()) {
            Apoyo apoyo = iapoyos.next();
            japoyos.put(apoyo.toJSON());
        }

        return japoyos;
    }
}
