package com.dominic.amazoo.service;

import com.dominic.amazoo.model.Customer;
import com.dominic.amazoo.model.Order;
import com.dominic.amazoo.model.OrderList;
import com.dominic.amazoo.model.Product;

/**
 * This is where I put all customer's behavior and actions.
 */
public class CustomerService {
    private final Customer customer;
    private final OrderList cart;

    public CustomerService(Customer customer) {
        this.customer = customer;
        this.cart = customer.getCart();
    }

    public void addItemToCart(Order order) {
        this.cart.addToList(order);
    }

    public void removeItemFromCart(Order order) {
        this.cart.removeFromList(order);
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderList getCart() {
        return cart;
    }
}
