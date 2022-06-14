package com.bridgelabz;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMPLOYEE_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAX_HOURS_A_MONTH = 100;
    public static void employeeWage(){
        int employeeHours = 0;
        int totalWorkingDays = 0, totalEmployeeHours=0;

        while (totalEmployeeHours <= MAX_HOURS_A_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalEmployeeHours += employeeHours;
            System.out.println("Day " + totalWorkingDays +" Employee working Hour: "+employeeHours);

        }
        int totalEmployeeWage = totalEmployeeHours * EMPLOYEE_RATE_PER_HOUR;
        System.out.println();
        System.out.println("Total employee wage : " +totalEmployeeWage );
    }
    public static void main(String[] ags) {
        employeeWage();
    }
}
