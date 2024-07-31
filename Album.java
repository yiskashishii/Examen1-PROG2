package com.musical;

import java.time.LocalDate;
import java.util.Set;

public class Album {
    private int id;
    private String nom;
    private LocalDate datedeSortie;
    private Set<String> chansons;

    public Album(int id, String nom, LocalDate datedeSortie, Set<String> chansons){
        this.id = id;
        this.nom = nom;
        this.datedeSortie = datedeSortie;
        this.chansons = chansons;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDatedeSortie() {
        return datedeSortie;
    }

    public Set<String> getChansons() {
        return chansons;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDatedeSortie(LocalDate datedeSortie) {
        this.datedeSortie = datedeSortie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setChansons(Set<String> chansons) {
        this.chansons = chansons;
    }
}
