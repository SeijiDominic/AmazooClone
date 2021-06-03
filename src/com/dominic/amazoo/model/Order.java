package com.dominic.amazoo.model;

import com.dominic.amazoo.exceptions.DemandExceededStockException;

public class Order {
    private final Product product;
    private Integer quantity;
    private final Double total;

    public Order(Product product, Integer quantity) {
        this.product = product;

        if (quantity <= product.getStock()) {
            this.quantity = quantity;
        } else throw new DemandExceededStockException();

        total = product.getPrice() * this.quantity;
    }

    public Double getTotal() {
        return total;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    //About to implement refund functionality. Refund just sends a negative value.
    public void updateProductStock() throws DemandExceededStockException {
        if (quantity > product.getStock()) throw new DemandExceededStockException();

        if (quantity >= 0) {
            this.product.setStock(product.getStock() - this.quantity);
        } else {
            this.product.setStock(product.getStock() + this.quantity);
        }
    }


}
