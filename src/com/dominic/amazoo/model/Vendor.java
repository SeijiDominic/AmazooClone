package com.dominic.amazoo.model;

import java.util.ArrayList;

public class Vendor {
    private String firstName;
    private String lastName;
//    private static ProductList products;
    private OrderList orders;

    public Vendor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = new OrderList(new ArrayList<>());
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public ProductList getItems() {
//        return products;
//    }

    public OrderList getOrders() {
        return orders;
    }
}
