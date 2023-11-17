package com.puentes_puj.api.model.componente;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String calificacion;
    private String mantenimiento;
    private String insp_esp;
    private Integer numero_fotos;
    private Integer tipo_danio;
    private String danio;
    private Long puenteid;

    public Componente() {
        super();
        this.id = null;
        this.nombre = null;
        this.calificacion = null;
        this.mantenimiento = null;
        this.insp_esp = null;
        this.numero_fotos = null;
        this.tipo_danio = null;
        this.danio = null;
        this.puenteid = null;
    }

    public Componente(Long id, String nombre, String calificacion, String mantenimiento, String insp_esp,
            Integer numero_fotos, Integer tipo_danio, String danio, Long puenteid) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.mantenimiento = mantenimiento;
        this.insp_esp = insp_esp;
        this.numero_fotos = numero_fotos;
        this.tipo_danio = tipo_danio;
        this.danio = danio;
        this.puenteid = puenteid;
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

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getInsp_esp() {
        return insp_esp;
    }

    public void setInsp_esp(String insp_esp) {
        this.insp_esp = insp_esp;
    }

    public Integer getNumero_fotos() {
        return numero_fotos;
    }

    public void setNumero_fotos(Integer numero_fotos) {
        this.numero_fotos = numero_fotos;
    }

    public Integer getTipo_danio() {
        return tipo_danio;
    }

    public void setTipo_danio(Integer tipo_danio) {
        this.tipo_danio = tipo_danio;
    }

    public String getDanio() {
        return danio;
    }

    public void setDanio(String danio) {
        this.danio = danio;
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
        japplication.put("nombre", getNombre());
        japplication.put("calificacion", getCalificacion());
        japplication.put("mantenimiento", getMantenimiento());
        japplication.put("insp_esp", getInsp_esp());
        japplication.put("numero_fotos", getNumero_fotos());
        japplication.put("tipo_danio", getTipo_danio());
        japplication.put("danio", getDanio());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Componente> componentes ) throws Exception {
		JSONArray jcomponentes = new JSONArray();
        Iterator<Componente> icomponentes = componentes.iterator();
        while(icomponentes.hasNext()) {
            Componente componente = icomponentes.next();
            jcomponentes.put(componente.toJSON());
        }

        return jcomponentes;
    }
}
