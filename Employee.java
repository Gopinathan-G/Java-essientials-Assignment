package com.Employee;

public class Employee {
    public String name,city;
    int age;
    public void display(){
        System.out.println("The name is"+this.name);
        System.out.println(this.age);
        System.out.println(this.city);
    }
    public void main(){
        Employee e = new Employee() ;
        e.name="Gopi";
        e.age=20;
        e.city="punjab";
        Employee e1 = new Employee();
        e1.name="Kesavan";
        e1.age=30;
        e1.city="kerala";
        e.display();
        e1.display();
    }
}


