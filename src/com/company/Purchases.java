package com.company;

public class Purchases {
    private int productCodes;
    private String productName;
    private double price;
    private int quantity;
    private double total;

    public Purchases(int productCodes, String productName, double price, int quantity, double total) {
        this.productCodes = productCodes;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.total = total;
    }


}
