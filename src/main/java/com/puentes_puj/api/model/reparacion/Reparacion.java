package com.puentes_puj.api.model.reparacion;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class Reparacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String tipo;
    private Integer cantidad;
    private Integer anio;
    private Integer costo;
    private Integer reparacionid;

    public Reparacion() {
        super();
        this.id = null;
        this.tipo = null;
        this.cantidad = null;
        this.anio = null;
        this.costo = null;
        this.reparacionid = null;
    }

    public Reparacion(Long id, String tipo, Integer cantidad, Integer anio, Integer costo, Integer reparacionid) {
        super();
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.anio = anio;
        this.costo = costo;
        this.reparacionid = reparacionid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getComponenteid() {
        return reparacionid;
    }

    public void setComponenteid(Integer reparacionid) {
        this.reparacionid = reparacionid;
    }

    public JSONObject toJSON() throws Exception {
        JSONObject japplication = new JSONObject();
        japplication.put("id", getId());
        japplication.put("tipo", getTipo());
        japplication.put("cantidad", getCantidad());
        japplication.put("anio", getAnio());
        japplication.put("costo", getCosto());
        japplication.put("reparacionid", getComponenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Reparacion> reparacions ) throws Exception {
		JSONArray jreparacions = new JSONArray();
        Iterator<Reparacion> ireparacions = reparacions.iterator();
        while(ireparacions.hasNext()) {
            Reparacion reparacion = ireparacions.next();
            jreparacions.put(reparacion.toJSON());
        }

        return jreparacions;
    }
}
