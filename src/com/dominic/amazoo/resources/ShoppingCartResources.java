package com.dominic.amazoo.resources;

import com.dominic.amazoo.exceptions.DemandExceededStockException;
import com.dominic.amazoo.model.Order;
import com.dominic.amazoo.model.OrderList;
import com.dominic.amazoo.model.Product;
import com.dominic.amazoo.service.CustomerService;
import com.dominic.amazoo.service.ProductService;
import com.dominic.amazoo.service.VendorService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShoppingCartResources {
    private final CustomerService customerService;
    private final VendorService vendorService;

    public ShoppingCartResources(CustomerService customerService, VendorService vendorService) {
        this.customerService = customerService;
        this.vendorService = vendorService;
    }

    /**
     * Check for currently existing Order to avoid multiple instances of Order of the same product.
     * @param product Product to order.
     * @return Optional Order
     */
    public Optional<Order> existingOrder(Product product) {
        List<Order> orders = customerService.getCustomer().getCart().getList();
        return orders.stream()
                .filter(o -> !o.getProduct().equals(product))
                .findFirst();
    }

    /**
     * Using streams, check if the order already exists. If so, override the quantity field.
     * Create a new Order instance, otherwise.
     *
     * WHY??
     * I want to give users the ability to reduce the qty of product one by one once they
     * entered a mistyped product quantity.
     *
     * Also, for efficient processing.
     * @param product Product to order.
     * @param qty Product quantity.
     */
    public void addItemToCart(Product product, Integer qty) {
        Optional<Order> order = existingOrder(product);

        if (order.isPresent()) {
            customerService.removeItemFromCart(order.get());

            if (qty != 0) {
                customerService.addItemToCart(new Order(product, qty));
            }
        } else {
            customerService.addItemToCart(new Order(product, qty));
        }

    }

    /**
     * As the name suggests, removes currently existing Order, WHOLE...
     * @param product Product that is owned by the Order.
     */
    public void removeItemFromCart(Product product) {
        Optional<Order> order = existingOrder(product);

        if (order.isPresent()) {
            customerService.removeItemFromCart(order.get());
        } else {
            System.out.println("Such order does not exist.");
        }
    }

    /**
     * Send a copy of the shopping cart to the vendor to manage inventory. To be implemented.
     * @throws CloneNotSupportedException
     */
    public void checkout() throws CloneNotSupportedException {
        OrderList orders = (OrderList) customerService.getCart().clone();


        // TODO: 03/06/2021 More implementations here pls. thx.


        vendorService.registerOrder(orders);
    }
}

























































