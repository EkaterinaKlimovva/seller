package com.example.seller.model;

public class Product {
    private long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String createUser;

    public Product() {
    }

    public Product(long id, String title, String description, int price, String city, String createUser) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.city = city;
        this.createUser = createUser;
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCity() {
        return this.city;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}
