package com.dominic.amazoo.service;

import com.dominic.amazoo.model.*;

import java.util.List;

public class VendorService {
    private final Vendor vendor;
    private final ProductList products;
    private final OrderList orders;


    public VendorService(Vendor vendor) {
        this.vendor = vendor;
        this.products = vendor.getItems();
        this.orders = vendor.getOrders();
    }

    public void addProduct(Product p) {
        this.products.addProduct(p);
    }

    public void addProduct(List<Product> productList) {
        this.products.addProduct(productList);
    }

    public void removeProduct(Product p) {
        this.products.removeProduct(p);
    }

    public void removeProduct(List<Product> products) {
        this.products.removeProduct(products);
    }

    public void addOrder(Order order) {
        this.orders.addToList(order);
    }

    public void addOrder(OrderList ol) {
        this.orders.addToList(ol.getList());
    }

    public void registerOrder(OrderList ol) {
        addOrder(ol);
    }


    public Vendor getVendor() {
        return vendor;
    }

    public OrderList getOrders() {
        return orders;
    }

    public ProductList getProducts() {
        return products;
    }
}







































