package com.Quiz;
import java.util.Scanner;

public class Question {
    Scanner sc=new Scanner(System.in);
    String Question,Option1,Option2,Option3,Option4;
    int CorrectAnswer,UserAnswer;

    public Boolean askQuestion()
    {
        System.out.println(Question);
        System.out.println("1."+Option1);
        System.out.println("2."+Option2);
        System.out.println("3."+Option3);
        System.out.println("4."+Option4);
        System.out.println("Please choose an Option");
        UserAnswer=sc.nextInt();
        if (UserAnswer==CorrectAnswer){
            return true;
        }
        return false;
    }

}
