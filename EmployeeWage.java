package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMPLOYEE_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static void main(String[] ags) {

        int employeeHours = 0;
        int employeeWage = 0;
        int totalEmployeeWage = 0;

        for (int day = 0; day < NUMBER_OF_WORKING_DAYS; day++) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {

                case (IS_FULL_TIME):
                    employeeHours = 8;
                    break;
                case (IS_PART_TIME):
                    employeeHours = 4;
                    break;
                default:
                    employeeHours = 0;
            }
            employeeWage = employeeHours * EMPLOYEE_RATE_PER_HOUR;
            totalEmployeeWage += employeeWage;
            System.out.println("Daily employee wage : " + employeeWage);
        }
        System.out.println();
        System.out.println("Total employee wage : " +totalEmployeeWage );
    }
}
