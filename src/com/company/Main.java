package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SalaryEmployee salaryEmployee = new SalaryEmployee("mr","karin","ahamed",5000);
        System.out.println(salaryEmployee.getFullName());
        System.out.println(salaryEmployee.getToltalEarning());

        ComissionEmployee comissionEmployee = new ComissionEmployee("md","sumon",
                "abc",5,1000);

        System.out.println(comissionEmployee.getFullName());
        System.out.println(comissionEmployee.getToltalEarning());

        SalaryPlusComissionEmployee salaryPlusComissionEmployee = new SalaryPlusComissionEmployee("md","abc",
                "def",10000,5,1000);


        System.out.println(salaryPlusComissionEmployee.getFullName());
        System.out.println(salaryPlusComissionEmployee.getToltalEarning());




    }
}
