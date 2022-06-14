package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int isFullTime = 1;
        int empRatePerHour = 20;
        int empHours = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            empHours = 8;
        else
            empHours = 0;
        empWage = empHours * empRatePerHour;
        System.out.println("Daily employee wage : "+empWage);
    }
}
