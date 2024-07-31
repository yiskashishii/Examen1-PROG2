package com.musical;

import java.time.LocalDate;

public class Artiste {
    private String nom;
    private int id;
    private LocalDate dateDebut;
    private String nationalité;

    public Artiste(String nom, int id, LocalDate dateDebut, String nationalité){
        this.nom = nom;
        this.id = id;
        this.dateDebut = dateDebut;
        this.nationalité = nationalité;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }
}
