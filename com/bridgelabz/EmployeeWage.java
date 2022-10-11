package com.bridgelabz;


    public class EmployeeWage {

        static final int DAILY_TIME_HOUR = 8;
        static final int EMP_WAGE_PER_HOUR = 20;
        static int FULL_TIME_HOUR = 8;
        static int PART_TIME_HOUR = 4;

        public static void main(String[] args) {
            int days = 20;
            int totalWage = 0;
            for (int i = 1; i <= days; i++) {
                int employeeCheck = (int) Math.floor(Math.random() * 3);
                System.out.println("For day "+i);
                System.out.println(employeeCheck);
                int dailyWage = 0;
                switch (employeeCheck) {
                    case 2:
                        System.out.println("Employee is present");
                        dailyWage = EMP_WAGE_PER_HOUR * DAILY_TIME_HOUR;
                        dailyWage = EMP_WAGE_PER_HOUR * FULL_TIME_HOUR;
                        totalWage=totalWage+dailyWage;
                        System.out.println("Daily wage is " + dailyWage);
                        break;
                    case 1:
                        System.out.println("Employee is present");
                        dailyWage = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                        System.out.println("Daily wage is " + dailyWage);
                        totalWage=totalWage+dailyWage;
                        break;
                    default:
                        System.out.println("Employee is absent");
                        System.out.println("Daily wage is " + dailyWage);
                }
            }
            System.out.println("Total wage is : "+totalWage);
        }
        }



