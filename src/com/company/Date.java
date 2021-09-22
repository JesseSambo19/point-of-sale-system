package com.company;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
