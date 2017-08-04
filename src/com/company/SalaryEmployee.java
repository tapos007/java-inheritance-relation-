package com.company;

public final class SalaryEmployee extends Employee{

    private double salary;

    public SalaryEmployee(String firstName, String middleName, String lastName, double salary) {
        super(firstName, middleName, lastName);
        this.salary = salary;
    }


    public double getToltalEarning(){
        return this.salary;
    }

}
