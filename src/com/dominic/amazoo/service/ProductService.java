package com.dominic.amazoo.service;

import com.dominic.amazoo.exceptions.DemandExceededStockException;
import com.dominic.amazoo.model.Product;

public class ProductService {
    private Product product;

    public ProductService(Product product) {
        this.product = product;
    }



}
