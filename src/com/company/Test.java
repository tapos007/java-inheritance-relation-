package com.company;

public class Test extends Employee {
    public Test(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    @Override
    public double totalEarning() {
        return 0;
    }
}
