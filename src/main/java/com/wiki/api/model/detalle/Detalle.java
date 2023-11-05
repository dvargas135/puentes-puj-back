package com.wiki.api.model.detalle;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;
import com.wiki.api.model.detalle.Detalle;

@Entity
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo_baranda;
    private String superficie_rodadura;
    private String junta_expansion;
    private Long puenteid;

    public Detalle() {
        super();
        this.id = null;
        this.tipo_baranda = null;
        this.superficie_rodadura = null;
        this.junta_expansion = null;
        this.puenteid = null;
    }

    public Detalle(Long id, String tipo_baranda, String superficie_rodadura, String junta_expansion, Long puenteid) {
        super();
        this.id = id;
        this.tipo_baranda = tipo_baranda;
        this.superficie_rodadura = superficie_rodadura;
        this.junta_expansion = junta_expansion;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_baranda() {
        return tipo_baranda;
    }

    public void setTipo_baranda(String tipo_baranda) {
        this.tipo_baranda = tipo_baranda;
    }

    public String getSuperficie_rodadura() {
        return superficie_rodadura;
    }

    public void setSuperficie_rodadura(String superficie_rodadura) {
        this.superficie_rodadura = superficie_rodadura;
    }

    public String getJunta_expansion() {
        return junta_expansion;
    }

    public void setJunta_expansion(String junta_expansion) {
        this.junta_expansion = junta_expansion;
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
        japplication.put("tipo_baranda", getTipo_baranda());
        japplication.put("superficie_rodadura", getSuperficie_rodadura());
        japplication.put("junta_expansion", getJunta_expansion());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Detalle> detalles ) throws Exception {
		JSONArray jdetalles = new JSONArray();
        Iterator<Detalle> idetalles = detalles.iterator();
        while(idetalles.hasNext()) {
            Detalle detalle = idetalles.next();
            jdetalles.put(detalle.toJSON());
        }

        return jdetalles;
    }
}
