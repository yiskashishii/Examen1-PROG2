package com.musical;

import java.util.Set;

public class Playlist {
    private int id;
    private String nom;
    private Set<Song> chansons;
    private Set<String> genre2;
    private Set<String> likes;

    public Playlist(int id, String nom, Set<Song> chanson, Set<String> genre2, Set<String> likes){
        this.id = id;
        this.nom = nom;
        this.chanson = chanson;
        this.genre2 = genre2;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Song> getChansons() {
        return chansons;
    }

    public void setChansons(Set<Song> chansons) {
        this.chansons = chansons;
    }

    public Set<String> getGenre2() {
        return genre2;
    }

    public void setGenre2(Set<String> genre2) {
        this.genre2 = genre2;
    }

    public Set<String> getLikes() {
        return likes;
    }

    public void setLikes(Set<String> likes) {
        this.likes = likes;
    }

    public void addToPlaylist(Song chansons){
        Song.add(chansons);
    }

    public void removeById (int chansonId) {
        if (chansons.getId.equals(chansonId)){
            chansons.remove;
        }
    }

    
}
