package com.project.entities;

import java.util.List;

public class Aeroport {
    private String code;
    private Ville ville;

    public List<Ville> getVillesDesservies() {
        // implementation
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }
}
