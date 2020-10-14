package com.Employee;

import java.util.Scanner;

public class totaloffivesubjects{
    public static void main(String[] args) {
        float Biology,Physics,Maths,English,Chemistry;
        double Total,Average,Percentage;
        Scanner op=new Scanner(System.in);
        System.out.println("Enter the marks of five subjects");
        System.out.println("Enter Biology Marks:");
        Biology=op.nextFloat();
        System.out.println("Enter Physics Marks:");
        Physics= op.nextFloat();
        System.out.println("Enter Maths Marks:");
        Maths= op.nextFloat();
        System.out.println("Enter English Mark:");
        English= op.nextFloat();
        System.out.println("Enter Chemistry Marks:");
        Chemistry=op.nextFloat();
        Total = Biology+Physics+Maths+English+Chemistry;
        Percentage = (Total/500.0)*100;
        Average = Total/5.0;

        if (Percentage>=90)
        {
            System.out.println("Grade O");
        }
        else if(Percentage>=80&&Percentage<=90)
        {
            System.out.println("Grade A");
        }

        else if(Percentage>=70&&Percentage<=80)
        {
            System.out.println("Grade B");
        }
        else if(Percentage>=60&&Percentage<=70)
        {
            System.out.println("Grade C");
        }
        else if(Percentage>=50&&Percentage<=60)
        {
            System.out.println("Grade D");
        }
        else if(Percentage>=40&&Percentage<=50)
        {
            System.out.println("Grade E");
        }
        else if(Percentage<40)
        {
            System.out.println("Grade F");
        }
     else
        {
            System.out.println("Enter Correct Values!!");

        }
        System.out.println("total marks:"+Total);
        System.out.println("average marks:"+Average);
        System.out.println("percentage marks:"+Percentage);

    }
}

