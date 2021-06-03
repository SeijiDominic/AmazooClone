package com.dominic.amazoo.model;

import java.util.List;

public class OrderList {
    private final List<Order> list;
    private Double total;

    public OrderList(List<Order> list) {
        this.list = list;
        updateOrder();
    }

    public void updateOrder() {
        for (Order order : list) {
            order.updateProductStock();
            this.total += order.getTotal();
        }
    }

    public void addToList(Order order) {
        total += order.getTotal();
        this.list.add(order);
    }

    public void addToList(List<Order> orders) {
        for(Order order : orders) {
            total += order.getTotal();
        }
        this.list.addAll(orders);

    }

    public void removeFromList(Order order) {
        total -= order.getTotal();
        this.list.remove(order);
    }

    public void removeFromList(List<Order> orders) {
        for(Order order : orders) {
            total -= order.getTotal();
        }
        this.list.removeAll(orders);
    }

    public List<Order> getList() {
        return list;
    }

    public Double getTotal() {
        return total;
    }

    public Integer getSize() {
        return this.list.size();
    }




}








































