package com.wiki.api.model.pila;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class Pila {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String material;
    private String tipo_cimentacion;
    private Long puenteid;

    public Pila() {
        super();
        this.id = null;
        this.tipo = null;
        this.material = null;
        this.tipo_cimentacion = null;
        this.puenteid = null;
    }

    public Pila(Long id, String tipo, String material, String tipo_cimentacion, Long puenteid) {
        super();
        this.id = id;
        this.tipo = tipo;
        this.material = material;
        this.tipo_cimentacion = tipo_cimentacion;
        this.puenteid = puenteid;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo_cimentacion() {
        return tipo_cimentacion;
    }

    public void setTipo_cimentacion(String tipo_cimentacion) {
        this.tipo_cimentacion = tipo_cimentacion;
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
        japplication.put("tipo", getTipo());
        japplication.put("material", getMaterial());
        japplication.put("tipo_cimentacion", getTipo_cimentacion());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Pila> pilas ) throws Exception {
		JSONArray jpilas = new JSONArray();
        Iterator<Pila> ipilas = pilas.iterator();
        while(ipilas.hasNext()) {
            Pila pila = ipilas.next();
            jpilas.put(pila.toJSON());
        }

        return jpilas;
    }
}
