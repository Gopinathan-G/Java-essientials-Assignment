import java.util.Scanner;

public class Avenger {
    Scanner sc=new Scanner(System.in);

    String name,power,weapon,planet;
    int age;
    public void getDetails()
    {
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your power");
        power=sc.nextLine();
        System.out.println("Enter your weapon");
        weapon=sc.nextLine();
        System.out.println("Enter your planet");
        planet=sc.nextLine();

        System.out.println("Enter your age");
        age=sc.nextInt();

    }
    public void displayDetails()
    {
       // System.out.println("Your name is"+name);
     //   System.out.println("Your power is"+power);
       // System.out.println("Your weapon is"+weapon);
       // System.out.println("Your planet is"+planet);

      //  System.out.println("Your age is"+age);
        System.out.println("your name is "+name+", your power is "+power+", weapon is "+weapon+" you are from "+planet+"and your age is "+age+".");
    }


}
