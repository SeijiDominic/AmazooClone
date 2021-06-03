package com.dominic.amazoo.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final OrderList cart;

    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cart = new OrderList(new ArrayList<>());
    }

    public String getAddress() {
        return address;
    }

    public OrderList getCart() {
        return cart;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s\nShopping Cart: %s", firstName, lastName, cart);
    }
}
