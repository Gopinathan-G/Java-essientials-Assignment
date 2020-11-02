package com.Gopinathan;

import java.util.Scanner;

public class Engineer extends Employee  {
    private Long EngineerID;
    Scanner sc=new Scanner(System.in);

    public void setEngineerID(){
        System.out.println("Enter Engineer ID");
        EngineerID= sc.nextLong();
    }
    public  void getEngineerID(){
        System.out.println("Engineer ID is"+EngineerID);
    }
}
