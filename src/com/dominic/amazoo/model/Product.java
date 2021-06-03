package com.dominic.amazoo.model;

public class Product {
    private final Vendor vendor;
    private final String name;
    private Integer stock;
    private final Double price;

    public Product(Vendor vendor, String name, Integer stock, Double price) {
        this.vendor = vendor;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }


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
