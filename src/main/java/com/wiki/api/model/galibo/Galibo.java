package com.wiki.api.model.galibo;

import java.util.Iterator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

@Entity
public class Galibo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long i;
    private Long im;
    private Long dm;
    private Long d;

    public Galibo() {
        this.id = null;
        this.i = null;
        this.im = null;
        this.dm = null;
        this.d = null;
    }

    public Galibo(Long id, Long i, Long im, Long dm, Long d) {
        this.id = id;
        this.i = i;
        this.im = im;
        this.dm = dm;
        this.d = d;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getI() {
        return i;
    }

    public void setI(Long i) {
        this.i = i;
    }

    public Long getIm() {
        return im;
    }

    public void setIm(Long im) {
        this.im = im;
    }

    public Long getDm() {
        return dm;
    }
    
    public void setDm(Long dm) {
        this.dm = dm;
    }

    public Long getD() {
        return d;
    }
    
    public void setD(Long d) {
        this.d = d;
    }

    public JSONObject toJSON() throws Exception {
        JSONObject japplication = new JSONObject();
        japplication.put("id", getId());
        japplication.put("i", getI());
        japplication.put("im", getIm());
        japplication.put("dm", getDm());
        japplication.put("d", getD());

        return japplication;
    }
    
    public static JSONArray toJSONArray( Iterable<Galibo> galibos ) throws Exception {
		JSONArray jgalibos = new JSONArray();
        Iterator<Galibo> igalibos = galibos.iterator();
        while(igalibos.hasNext()) {
            Galibo galibo = igalibos.next();
            jgalibos.put(galibo.toJSON());
        }

        return jgalibos;
    }
}
