package com.dominic.amazoo.service;

import com.dominic.amazoo.model.*;

import java.util.List;

public class VendorService {
    private final Vendor vendor;
//    private final ProductList products;
    private final OrderList orders;


    public VendorService(Vendor vendor) {
        this.vendor = vendor;
//        this.products = vendor.getItems();
        this.orders = vendor.getOrders();
    }


    public void addOrder(Order order) {
        this.orders.addToList(order);
    }

    public void addOrder(OrderList orderList) throws CloneNotSupportedException{
        this.orders.addToList((Order) orderList.clone());
    }

    public void registerOrder(OrderList ol) throws CloneNotSupportedException {
        addOrder(ol);
    }


    public Vendor getVendor() {
        return vendor;
    }

    public OrderList getOrders() {
        return orders;
    }

}







































