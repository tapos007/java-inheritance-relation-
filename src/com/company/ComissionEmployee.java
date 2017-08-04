package com.company;

public class ComissionEmployee extends Employee{

    private double comissionRate;
    private double totalSell;

    public ComissionEmployee(String firstName, String middleName, String lastName, double comissionRate, double totalSell) {
        super(firstName, middleName, lastName);
        this.comissionRate = comissionRate;
        this.totalSell = totalSell;
    }

    public double getToltalEarning(){
        return (this.comissionRate * this.totalSell)/ 100;
    }
}
