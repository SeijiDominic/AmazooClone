package com.dominic.amazoo.model;

import com.dominic.amazoo.exceptions.DemandExceededStockException;

public class Order {
    private final Product product;
    private final Integer quantity;
    private final Double total;

    public Order(Product product, Integer quantity) {
        this.product = product;

        if (isValidQuantity()) {
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

    //About to implement refund functionality. Refund just sends a negative value.
    public void updateProductStock() throws DemandExceededStockException{
        if (!isValidQuantity()) {
            throw new DemandExceededStockException();
        }
        if (quantity >= 0) {
            this.product.setStock(product.getStock() - this.quantity);
        } else {
            this.product.setStock(product.getStock() + this.quantity);
        }
    }


    public Boolean isValidQuantity() {
        return quantity <= product.getStock();
    }
}
