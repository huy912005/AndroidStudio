package com.example.viewpage.Model;

public class Culture {
    private int image;
    private String name;
    private String country;

    public Culture(int image, String name, String country) {
        this.image = image;
        this.name = name;
        this.country = country;
    }

    public int getImage() { return image; }
    public String getName() { return name; }
    public String getCountry() { return country; }
}

