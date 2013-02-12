package com.github.marceloemanoel.vraptor.jscontroller.sample;

public class Promotion {

    private Integer id;
    private Product product;
    private String image;
    
    public Promotion(Integer id, Product product, String image) {
        this.id = id;
        this.product = product;
        this.image = image;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
