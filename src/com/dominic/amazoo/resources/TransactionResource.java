package com.dominic.amazoo.resources;

import com.dominic.amazoo.model.Order;
import com.dominic.amazoo.model.OrderList;
import com.dominic.amazoo.service.CustomerService;
import com.dominic.amazoo.service.VendorService;

public class TransactionResource {
    private final CustomerService customerService;
    private final VendorService vendorService;

    public TransactionResource(CustomerService customerService, VendorService vendorService) {
        this.customerService = customerService;
        this.vendorService = vendorService;
    }




}
