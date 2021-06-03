package com.dominic.amazoo.model;

import java.util.List;

public class ProductList {
    private final List<Product> products;

    public ProductList(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void addProduct(List<Product> products) {
        this.products.addAll(products);
    }

    public void removeProduct(Product p) {
        this.products.remove(p);
    }

    public void removeProduct(List<Product> p) {
        this.products.removeAll(p);
    }

    public List<Product> getProducts() {
        return products;
    }
}
