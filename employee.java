package com.Employee;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        String name;
        int dob, mob, yob, monthly_salary, tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();

        System.out.println("Enter your day of birth");
        dob=sc.nextInt();
        System.out.println("Enter your month of birth in number from 1 to 12 ");
        mob=sc.nextInt();
        System.out.println("Enter your year of birth in number");
        yob=sc.nextInt();
        System.out.println("Enter your monthly salary");
        monthly_salary=sc.nextInt();
        int age=2020-yob;

        int annual_salary = (monthly_salary*12);

        if(annual_salary >=500000){
            tax=(annual_salary*20)/100;
            System.out.println("HELLO,"+name+",Your Age is" +age+",Your Annual salary is "+annual_salary+",and Your Tax Amount is "+tax);
        }
        else if (annual_salary >=400000){
            tax=(annual_salary*15)/100;
            System.out.println("HELLO,"+name+",Your Age is "+age+",Your Annual Salary is "+annual_salary+",and Your Tax Amount is"+tax);
        }
        else if (annual_salary >=300000){
            tax=(annual_salary*10)/100;
            System.out.println("HELLO,"+name+",Your Age is "+age+",Your Annual Salary is "+annual_salary+",and Your Tax Amount is"+tax);
        }
        else if (annual_salary >=200000) {
            tax = (annual_salary * 5) / 100;
            System.out.println("HELLO," + name + ",Your Age is " + age + ",Your Annual Salary is " + annual_salary + ",and Your Tax Amount is" + tax);
        }
        else
            {
            System.out.println("HELLO," + name + ",Your Age is " + age + ",Your Annual Salary is " + annual_salary + ",and Tax is no need to pay");
        }
    }
}
