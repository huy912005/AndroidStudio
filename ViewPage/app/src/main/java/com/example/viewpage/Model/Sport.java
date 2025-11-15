package com.example.viewpage.Model;

public class Sport {
    private int image;
    private String name;
    private String type;

    public Sport(int image, String name, String type) {
        this.image = image;
        this.name = name;
        this.type = type;
    }

    public int getImage() { return image; }
    public String getName() { return name; }
    public String getType() { return type; }
}

