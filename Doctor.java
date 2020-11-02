package com.Gopinathan;
import java.util.Scanner;

public class Doctor extends Employee {
    private String Doctorname;
    Scanner sc=new Scanner(System.in);

    public void setdoctorname(){
        System.out.println("Enter Doctor name");
        Doctorname=sc.next();

    }
    public void getdoctorname(){
        System.out.println("Trainning Doctor "+Doctorname);
    }

}
