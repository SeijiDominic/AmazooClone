package com.dominic.amazoo.resources;

import com.dominic.amazoo.exceptions.DemandExceededStockException;
import com.dominic.amazoo.model.Order;
import com.dominic.amazoo.model.Product;
import com.dominic.amazoo.service.CustomerService;
import com.dominic.amazoo.service.ProductService;

public class CartResources {
    private final ProductService productService;
    private final CustomerService customerService;

    public CartResources(ProductService productService, CustomerService customerService) {
        this.customerService = customerService;
        this.productService = productService;
    }

    public void addItemToCart(Product product, Integer qty) {
        Order o = new Order(product, qty);
        customerService.addItemToCart(o);
    }




    public void updateProductStock() throws DemandExceededStockException {
        if (!isValidQuantity()) {
            throw new DemandExceededStockException();
        }
        if (quantity >= 0) {
            this.product.setStock(product.getStock() - this.quantity);
        } else {
            this.product.setStock(product.getStock() + this.quantity);
        }
    }
}
