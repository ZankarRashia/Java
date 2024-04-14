//class and constructors
import java.util.*;
class Pen {
    String color;
    String type; //ballpoint // gel 

    public void write() {
        System.out.println("I got this Ro! I will make you proud");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}


class Student {
    String name; 
    int age;

    //Polymorphism
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

   /*  
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Non-Parameterized Constructor 
     Student() {
        System.out.println("Non-Parameterized Constructor");
    }

    //Parameterized Constructor 
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    //Base Constructor for testing
    Student() {}
    //Copy Constructor
    Student(Student s2) { 
        this.name  = s2.name;
        this.age = s2.age;
    }
    */
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen(); 
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball Point";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Zankar";
        s1.age = 25;

        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);

       // Student s2 = new Student(s1);
       // s2.printInfo();
    }
}
