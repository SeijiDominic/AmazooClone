package com.dominic.amazoo.model;

public class Product {
    private Vendor vendor;
    private String name;
    private Integer stock;
    private Double price;


    public Vendor getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Integer getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
