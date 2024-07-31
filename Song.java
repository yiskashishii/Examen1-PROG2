package com.musical;

import java.util.List;

public class Song {
    private int id;
    private String title;
    private int duration;
    private List<String> genre;

    public Song (int id, String title, int duration, List<String> genre){
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public static void add(Song chansons) {
        return ;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public List<String> getGenre() {
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

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }
}
