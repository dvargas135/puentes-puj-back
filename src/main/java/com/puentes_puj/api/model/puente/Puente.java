package com.puentes_puj.api.model.puente;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class Puente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String identif;
    private String carretera;
    private String pr;
    private String regional;
    private String observaciones_generales;
    private String fecha;
    private String tiempo;
    private Long temperatura;
    private String inspector;
    private String administrador;
    private String anio_proxima_inspeccion;

    public Puente() {
        super();
        this.id = null;
        this.nombre = null;
        this.identif = null;
        this.carretera = null;
        this.pr = null;
        this.regional = null;
        this.observaciones_generales = null;
        this.fecha = null;
        this.tiempo = null;
        this.temperatura = null;
        this.inspector = null;
        this.administrador = null;
        this.anio_proxima_inspeccion = null;
    }
    
    public Puente(Long id, String nombre, String identif, String carretera, String pr, String regional,
            String observaciones_generales, String fecha, String tiempo, Long temperatura, String inspector,
            String administrador, String anio_proxima_inspeccion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.identif = identif;
        this.carretera = carretera;
        this.pr = pr;
        this.regional = regional;
        this.observaciones_generales = observaciones_generales;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.temperatura = temperatura;
        this.inspector = inspector;
        this.administrador = administrador;
        this.anio_proxima_inspeccion = anio_proxima_inspeccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentif() {
        return identif;
    }

    public void setIdentif(String identif) {
        this.identif = identif;
    }

    public String getCarretera() {
        return carretera;
    }

    public void setCarretera(String carretera) {
        this.carretera = carretera;
    }

    public String getPr() {
        return pr;
    }

    public void setPr(String pr) {
        this.pr = pr;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getObservaciones_generales() {
        return observaciones_generales;
    }

    public void setObservaciones_generales(String observaciones_generales) {
        this.observaciones_generales = observaciones_generales;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Long getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Long temperatura) {
        this.temperatura = temperatura;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getAnio_proxima_inspeccion() {
        return anio_proxima_inspeccion;
    }

    public void setAnio_proxima_inspeccion(String anio_proxima_inspeccion) {
        this.anio_proxima_inspeccion = anio_proxima_inspeccion;
    }

    public JSONObject toJSON() throws Exception {
        JSONObject japplication = new JSONObject();
        japplication.put("id", getId());
        japplication.put("nombre", getNombre());
        japplication.put("identif", getIdentif());
        japplication.put("carretera", getCarretera());
        japplication.put("pr", getPr());
        japplication.put("regional", getRegional());
        japplication.put("observaciones_generales", getObservaciones_generales());
        japplication.put("fecha", getFecha());
        japplication.put("tiempo", getTiempo());
        japplication.put("temperatura", getTemperatura());
        japplication.put("inspector", getInspector());
        japplication.put("administrador", getAdministrador());
        japplication.put("anio_proxima_inspeccion", getAnio_proxima_inspeccion());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Puente> puentes ) throws Exception {
		JSONArray jpuentes = new JSONArray();
        Iterator<Puente> ipuentes = puentes.iterator();
        while(ipuentes.hasNext()) {
            Puente puente = ipuentes.next();
            jpuentes.put(puente.toJSON());
        }

        return jpuentes;
    }
}
