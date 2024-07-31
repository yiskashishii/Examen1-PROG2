package com.musical;

import java.util.List;

public class User {
    private int id;
    private List<Playlist> favorite;

    public User (int id, List<Playlist> favorite){
        this.id = id;
        this.favorite = favorite;
    }

    public int getId() {
        return id;
    }

    public List<Playlist> getFavorite() {
        return favorite;
    }
    public void setId (String id) {
        this.id;
    }
    public void SetFavorite (List<Playlist> favorite) {
        this.favorite;
    }
}