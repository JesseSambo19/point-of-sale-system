package com.company;

public class Beverage {
    private Date manufactureDate;
    private Date expiryDate;
    private String placeOfProduction;

    public Beverage(Date m, Date e, String p){
        this.manufactureDate = m;
        this.expiryDate = e;
        this.placeOfProduction = p;
    }
}
