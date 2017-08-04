package com.company;

public class SalaryEmployee {
    private  String firstName;
    private String middleName;
    private String lastName;
    private double salary;

    public SalaryEmployee(String firstName, String middleName, String lastName, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFullName(){
        return this.firstName + " "+ this.middleName + " "+ this.lastName;
    }

    public double getToltalEarning(){
        return this.salary;
    }

}
