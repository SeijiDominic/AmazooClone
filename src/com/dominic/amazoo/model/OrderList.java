package com.dominic.amazoo.model;

import java.util.List;

public class OrderList implements Cloneable {
    private final List<Order> list;
    private Double total = 0.0;

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

    public void addToList(OrderList orderList) {
        for (Order order : orderList.list) {
            total += order.getTotal();
        }
        this.list.addAll(orderList.getList());
    }


    public void removeFromList(Order order) {
        total -= order.getTotal();
        this.list.remove(order);
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        return String.format("Orders: %s\nTotal Amount: %s", list.toString(), total);
    }
}








































