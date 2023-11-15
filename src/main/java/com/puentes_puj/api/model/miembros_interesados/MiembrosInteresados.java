package com.puentes_puj.api.model.miembros_interesados;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class MiembrosInteresados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String propietario;

    private String departamento;

    private String administrador_vial;

    private String proyectista;

    private String municipio;

    private Long puenteid;

    public MiembrosInteresados() {
        super();
        this.id = null;
        this.propietario = null;
        this.departamento = null;
        this.administrador_vial = null;
        this.proyectista = null;
        this.municipio = null;
        this.puenteid = null;
    }

    public MiembrosInteresados(Long id, String propietario, String departamento, String administrador_vial,
            String proyectista, String municipio, Long puenteid) {
        super();
        this.id = id;
        this.propietario = propietario;
        this.departamento = departamento;
        this.administrador_vial = administrador_vial;
        this.proyectista = proyectista;
        this.municipio = municipio;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAdministrador_vial() {
        return administrador_vial;
    }

    public void setAdministrador_vial(String administrador_vial) {
        this.administrador_vial = administrador_vial;
    }

    public String getProyectista() {
        return proyectista;
    }

    public void setProyectista(String proyectista) {
        this.proyectista = proyectista;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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
        japplication.put("propietario", getPropietario());
        japplication.put("departamento", getDepartamento());
        japplication.put("administrador_vial", getAdministrador_vial());
        japplication.put("proyectista", getProyectista());
        japplication.put("municipio", getMunicipio());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<MiembrosInteresados> miembros_interesados ) throws Exception {
		JSONArray jmiembros_interesados = new JSONArray();
        Iterator<MiembrosInteresados> imiembros_interesados = miembros_interesados.iterator();
        while(imiembros_interesados.hasNext()) {
            MiembrosInteresados mi = imiembros_interesados.next();
            jmiembros_interesados.put(mi.toJSON());
        }

        return jmiembros_interesados;
    }
}
