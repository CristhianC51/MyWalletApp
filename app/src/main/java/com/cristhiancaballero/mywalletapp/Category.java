package com.cristhiancaballero.mywalletapp;

public class Category {

    private String name, color;
    private String imageUrl;

    public Category(String name, String color, String imageUrl) {
        this.name = name;
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
