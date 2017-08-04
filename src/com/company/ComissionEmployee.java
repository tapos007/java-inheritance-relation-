package com.company;

public class ComissionEmployee {
    private  String firstName;
    private String middleName;
    private String lastName;
    private double comissionRate;
    private double totalSell;

    public ComissionEmployee(String firstName, String middleName, String lastName, double comissionRate, double totalSell) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.comissionRate = comissionRate;
        this.totalSell = totalSell;
    }

    public String getFullName(){
        return this.firstName + " "+ this.middleName + " "+ this.lastName;
    }

    public double getToltalEarning(){
        return (this.comissionRate * this.totalSell)/ 100;
    }
}
