package com.github.marceloemanoel.vraptor.jscontroller.sample;

public class Product {

    private String description;
    private Double price;
    private String name;
    private Integer id;
    
    public Product() {
    }

    public Product(Integer id, String name, String description, Double price) {
        this.id = id; 
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
