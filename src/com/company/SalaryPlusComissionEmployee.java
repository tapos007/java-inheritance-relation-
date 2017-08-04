package com.company;

public class SalaryPlusComissionEmployee extends Employee{

    private double salary;
    private double comissionRate;
    private double totalSell;

    public SalaryPlusComissionEmployee(String firstName, String middleName, String lastName, double salary, double comissionRate, double totalSell) {
        super(firstName,middleName,lastName);
        this.salary = salary;
        this.comissionRate = comissionRate;
        this.totalSell = totalSell;
    }

    public double getToltalEarning(){
        return this.salary + (this.comissionRate * this.totalSell)/ 100;
    }
}
