package com.puentes_puj.api.model.datos_tecnicos;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class DatosTecnicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numero_luces;
    private Long longitud_luz_menor;
    private Long longitud_luz_mayor;
    private Long longitud_total;
    private Long ancho_tablero;
    private Long ancho_separador;
    private Long ancho_anden_izq;
    private Long ancho_anden_der;
    private Long ancho_calzada;
    private Long ancho_entre_bordillos;
    private Long ancho_acceso;
    private Long altura_pilas;
    private Long altura_estribos;
    private Long longitud_apoyo_pilas;
    private Long longitud_apoyo_estribos;
    private boolean puente_terrapien;
    private String puente_curva_tangente;
    private Long esviajamiento;
    private Long puenteid;

    public DatosTecnicos() {
        super();
        this.id = null;
        this.numero_luces = null;
        this.longitud_luz_menor = null;
        this.longitud_luz_mayor = null;
        this.longitud_total = null;
        this.ancho_tablero = null;
        this.ancho_separador = null;
        this.ancho_anden_izq = null;
        this.ancho_anden_der = null;
        this.ancho_calzada = null;
        this.ancho_entre_bordillos = null;
        this.ancho_acceso = null;
        this.altura_pilas = null;
        this.altura_estribos = null;
        this.longitud_apoyo_pilas = null;
        this.longitud_apoyo_estribos = null;
        this.puente_terrapien = false;
        this.puente_curva_tangente = null;
        this.esviajamiento = null;
        this.puenteid = null;
    }

    public DatosTecnicos(Long id, Long numero_luces, Long longitud_luz_menor, Long longitud_luz_mayor,
            Long longitud_total, Long ancho_tablero, Long ancho_separador, Long ancho_anden_izq, Long ancho_anden_der,
            Long ancho_calzada, Long ancho_entre_bordillos, Long ancho_acceso, Long altura_pilas, Long altura_estribos,
            Long longitud_apoyo_pilas, Long longitud_apoyo_estribos, boolean puente_terrapien,
            String puente_curva_tangente, Long esviajamiento, Long puenteid) {
        super();
        this.id = id;
        this.numero_luces = numero_luces;
        this.longitud_luz_menor = longitud_luz_menor;
        this.longitud_luz_mayor = longitud_luz_mayor;
        this.longitud_total = longitud_total;
        this.ancho_tablero = ancho_tablero;
        this.ancho_separador = ancho_separador;
        this.ancho_anden_izq = ancho_anden_izq;
        this.ancho_anden_der = ancho_anden_der;
        this.ancho_calzada = ancho_calzada;
        this.ancho_entre_bordillos = ancho_entre_bordillos;
        this.ancho_acceso = ancho_acceso;
        this.altura_pilas = altura_pilas;
        this.altura_estribos = altura_estribos;
        this.longitud_apoyo_pilas = longitud_apoyo_pilas;
        this.longitud_apoyo_estribos = longitud_apoyo_estribos;
        this.puente_terrapien = puente_terrapien;
        this.puente_curva_tangente = puente_curva_tangente;
        this.esviajamiento = esviajamiento;
        this.puenteid = puenteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero_luces() {
        return numero_luces;
    }

    public void setNumero_luces(Long numero_luces) {
        this.numero_luces = numero_luces;
    }

    public Long getLongitud_luz_menor() {
        return longitud_luz_menor;
    }

    public void setLongitud_luz_menor(Long longitud_luz_menor) {
        this.longitud_luz_menor = longitud_luz_menor;
    }

    public Long getLongitud_luz_mayor() {
        return longitud_luz_mayor;
    }

    public void setLongitud_luz_mayor(Long longitud_luz_mayor) {
        this.longitud_luz_mayor = longitud_luz_mayor;
    }

    public Long getLongitud_total() {
        return longitud_total;
    }

    public void setLongitud_total(Long longitud_total) {
        this.longitud_total = longitud_total;
    }

    public Long getAncho_tablero() {
        return ancho_tablero;
    }

    public void setAncho_tablero(Long ancho_tablero) {
        this.ancho_tablero = ancho_tablero;
    }

    public Long getAncho_separador() {
        return ancho_separador;
    }
    
    public void setAncho_separador(Long ancho_separador) {
        this.ancho_separador = ancho_separador;
    }

    public Long getAncho_anden_izq() {
        return ancho_anden_izq;
    }

    public void setAncho_anden_izq(Long ancho_anden_izq) {
        this.ancho_anden_izq = ancho_anden_izq;
    }

    public Long getAncho_anden_der() {
        return ancho_anden_der;
    }

    public void setAncho_anden_der(Long ancho_anden_der) {
        this.ancho_anden_der = ancho_anden_der;
    }

    public Long getAncho_calzada() {
        return ancho_calzada;
    }

    public void setAncho_calzada(Long ancho_calzada) {
        this.ancho_calzada = ancho_calzada;
    }

    public Long getAncho_entre_bordillos() {
        return ancho_entre_bordillos;
    }

    public void setAncho_entre_bordillos(Long ancho_entre_bordillos) {
        this.ancho_entre_bordillos = ancho_entre_bordillos;
    }

    public Long getAncho_acceso() {
        return ancho_acceso;
    }

    public void setAncho_acceso(Long ancho_acceso) {
        this.ancho_acceso = ancho_acceso;
    }

    public Long getAltura_pilas() {
        return altura_pilas;
    }

    public void setAltura_pilas(Long altura_pilas) {
        this.altura_pilas = altura_pilas;
    }

    public Long getAltura_estribos() {
        return altura_estribos;
    }

    public void setAltura_estribos(Long altura_estribos) {
        this.altura_estribos = altura_estribos;
    }

    public Long getLongitud_apoyo_pilas() {
        return longitud_apoyo_pilas;
    }

    public void setLongitud_apoyo_pilas(Long longitud_apoyo_pilas) {
        this.longitud_apoyo_pilas = longitud_apoyo_pilas;
    }

    public Long getLongitud_apoyo_estribos() {
        return longitud_apoyo_estribos;
    }

    public void setLongitud_apoyo_estribos(Long longitud_apoyo_estribos) {
        this.longitud_apoyo_estribos = longitud_apoyo_estribos;
    }

    public boolean isPuente_terrapien() {
        return puente_terrapien;
    }

    public void setPuente_terrapien(boolean puente_terrapien) {
        this.puente_terrapien = puente_terrapien;
    }

    public String getPuente_curva_tangente() {
        return puente_curva_tangente;
    }

    public void setPuente_curva_tangente(String puente_curva_tangente) {
        this.puente_curva_tangente = puente_curva_tangente;
    }

    public Long getEsviajamiento() {
        return esviajamiento;
    }

    public void setEsviajamiento(Long esviajamiento) {
        this.esviajamiento = esviajamiento;
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
        japplication.put("numero_luces", getNumero_luces());
        japplication.put("longitud_luz_menor", getLongitud_luz_menor());
        japplication.put("longitud_luz_mayor", getLongitud_luz_menor());
        japplication.put("longitud_total", getLongitud_total());
        japplication.put("ancho_tablero", getAncho_tablero());
        japplication.put("ancho_separador", getAncho_separador());
        japplication.put("ancho_anden_izq", getAncho_anden_izq());
        japplication.put("ancho_anden_der", getAncho_anden_der());
        japplication.put("ancho_calzada", getAncho_calzada());
        japplication.put("ancho_entre_bordillos", getAncho_entre_bordillos());
        japplication.put("ancho_acceso", getAncho_acceso());
        japplication.put("altura_pilas", getAltura_pilas());
        japplication.put("altura_estribos", getAltura_estribos());
        japplication.put("longitud_apoyo_pilas", getLongitud_apoyo_pilas());
        japplication.put("longitud_apoyo_estribos", getLongitud_apoyo_estribos());
        japplication.put("puente_terrapien", isPuente_terrapien());
        japplication.put("puente_curva_tangente", getPuente_curva_tangente());
        japplication.put("esviajamiento", getEsviajamiento());
        japplication.put("puenteid", getPuenteid());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<DatosTecnicos> datos_tecnicos ) throws Exception {
		JSONArray jdatos_tecnicos = new JSONArray();
        Iterator<DatosTecnicos> idatos_tecnicos = datos_tecnicos.iterator();
        while(idatos_tecnicos.hasNext()) {
            DatosTecnicos dt = idatos_tecnicos.next();
            jdatos_tecnicos.put(dt.toJSON());
        }

        return jdatos_tecnicos;
    }
}
