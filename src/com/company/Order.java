package com.company;

import javafx.util.Pair;

import java.util.List;

public class Order {
    private long orderNumber;
    private List< Pair<Item,Integer> > items;
    private Customer customer;

    public Order(long orderNumber, List<Pair<Item, Integer>> items, Customer customer) {
        this.orderNumber = orderNumber;
        this.items = items;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public List<Pair<Item, Integer>> getItems() {
        return items;
    }
}
