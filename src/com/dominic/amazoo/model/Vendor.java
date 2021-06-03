package com.dominic.amazoo.model;

public class Vendor {
    private String firstName;
    private String lastName;
    private static ProductList products;
    private static OrderList orders;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ProductList getItems() {
        return products;
    }

    public OrderList getOrders() {
        return orders;
    }
}
