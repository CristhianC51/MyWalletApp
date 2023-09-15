package com.cristhiancaballero.mywalletapp;

public class Account {

    private String name, type;
    private Double balance;
    private String imageUrl;

    public Account(String name, String type, Double balance, String imageUrl) {
        this.name = name;
        this.type = type;
        this.balance = balance;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
