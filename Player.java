package com.Quiz;
import java.util.Scanner;
public class Player {

    Scanner sc=new Scanner(System.in);
    String name;
    int Score=0;

    public void getDetails() {
        System.out.println("Enter Player Name");
        name=sc.next();
    }
}
