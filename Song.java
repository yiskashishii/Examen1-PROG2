package com.musical;

import java.util.Set;

public class Song {
    private int id;
    private String title;
    private int duration;
    private Set<String> genre;

    public Song (int id, String title, int duration, Set<String> genre){
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public static void add(Song chanson) {
    }

    public int getId() {
        return 0;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public Set<String> getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenre(Set<String> genre) {
        this.genre = genre;
    }
}
