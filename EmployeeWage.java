package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isPresent=1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isPresent)
            System.out.println("The Employee is Present");
        else
            System.out.println("The Employee is Absent");
    }
}
