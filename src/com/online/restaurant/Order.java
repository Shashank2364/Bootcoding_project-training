package com.online.restaurant;

import java.util.Date;
import java.util.List;

public class Order {
    private long orderID;

    private double totalAmount;
    private Vendor vendor;//vendor detail
    private Customer customer;
    private String deliveryAddress;
     private double price;
     private Date  orderdate;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    private List<OrderMenuItem> menuItem;

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<OrderMenuItem> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(List<OrderMenuItem> menuItem) {
        this.menuItem = menuItem;
    }
}

