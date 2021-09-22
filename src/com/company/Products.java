package com.company;

public class Products {
    private int productCode;
    private String productName;
    private double price;

    public Products(){

    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Products{" +
                "productCode=" + productCode +
                ", productName='" + productName + '\'' +
                '}';
    }

}
