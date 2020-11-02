package com.Gopinathan;

import java.util.Scanner;

public class Pilot extends Employee {
    private  long pilotID;
    Scanner sc=new Scanner(System.in);

    public  void setPilotID(){
        System.out.println("Enter Pilot ID");
        pilotID= sc.nextLong();

    }
    public void getPilotID(){
        System.out.println("Enter Pilot ID"+pilotID);
    }


}
