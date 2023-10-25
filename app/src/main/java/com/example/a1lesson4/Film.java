package com.example.a1lesson4;

import java.io.Serializable;

public class Film implements Serializable {

    private String name;
    private String poster;
    public Film(String name, String poster) {
        this.name = name;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }


    public String getPoster() {
        return poster;
    }
}
