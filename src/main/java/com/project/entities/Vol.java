package com.project.entities;

import java.util.Date;
import java.util.List;

public class Vol {
    private String numVol;
    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;
    private Date dateDepart;
    private Date dateArrivee;
    private List<Escale> escales;
    private CompagnieAerienne compagnie;

    public int getNbPlacesDisponibles() {
        // implementation
        return 0;
    }

    public String getNumVol() {
        return numVol;
    }

    public void setNumVol(String numVol) {
        this.numVol = numVol;
    }

    public Aeroport getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public Aeroport getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public List<Escale> getEscales() {
        return escales;
    }

    public void setEscales(List<Escale> escales) {
        this.escales = escales;
    }

    public CompagnieAerienne getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(CompagnieAerienne compagnie) {
        this.compagnie = compagnie;
    }
}

