package com.company;

public class Food extends Products {
    private Date manufactureDate;
    private Date expiryDate;
    private String placeOfProduction;

    public Food(Date m, Date e, String p){
        this.manufactureDate = m;
        this.expiryDate = e;
        this.placeOfProduction = p;
    }

}
