package com.project.entities;

import java.util.List;

public class CompagnieAerienne {
    private String code;
    private String libelle;
    private List<Vol> vols;

    public void ouvrirVol(Vol vol) {
        // implementation
    }

    public void fermerVol(Vol vol) {
        // implementation
    }

    public Reservation creerReservation(Client client, Vol vol) {
        // implementation
        return null;
    }

    public void annulerReservation(Reservation reservation) {
        // implementation
    }

    public List<Vol> consulterDisponibilite() {
        // implementation
        return null;
    }

    public List<Vol> getVols() {
        return vols;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setVols(List<Vol> vols) {
        this.vols = vols;
    }
}
