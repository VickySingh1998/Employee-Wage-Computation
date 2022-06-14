package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHour = 20;
        int empHours = 0;
        int empWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isFullTime)
            empHours = 8;
        else if (empCheck == isPartTime)
            empHours = 4;
        else
            empHours = 0;
        empWage = empHours * empRatePerHour;
        System.out.println("Daily employee wage : "+empWage);
    }
}
