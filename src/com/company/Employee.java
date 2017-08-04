package com.company;

public  abstract  class Employee {

    private  String firstName;
    private String middleName;
    private String lastName;


    public Employee(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return this.firstName + " "+ this.middleName + " "+ this.lastName;
    }

    public abstract double getToltalEarning();
}
