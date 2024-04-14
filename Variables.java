import java.util.*;

public class Variables {
    public static void main(String args[]) {

        //output
        System.out.println("Hello World!");

        //output way 2 
        System.out.println("Hello World!");

        //output way 3 
        System.out.print("Hello World!\n");

        //output way 4 
        System.out.print("Hello World!\n");



        //in-class assignment: Output
        System.out.print("*\n**\n***\n****\n");


        //variable 
        int a = 10; 
        int b = 25;
        int sum = a + b;
        System.out.println(sum);
        int diff = b - a;
        System.out.println(diff);

        int mul = a * b;
        System.out.println(mul);



        //input
        Scanner sc = new Scanner(System.in);
        String fullName = sc.next();
        System.out.println(fullName);


        Scanner sc2 = new Scanner(System.in);
        int z = sc2.nextInt();
        int r = sc2.nextInt();

        System.out.println(z + r);



        //Homework 

        //Quesetion 1: Declare meaninful variables of each types
        //byte zankar = 6;
        //short zanny = 5;
        //int zan = 3;
        //long Z = 123456;
        //float dabu = 0;
        //double zann = 6.9;
        //char nam = 'z';
        //boolean man = true;


        //Question 2: Make a program to calculate radius and area of a circle

        //area of circle = πr2

        double pi = 3.14;
        double radius = 0.0; 

        System.out.println("Please input a value for your radius: ");
        Scanner sc3 = new Scanner(System.in);
        radius = sc3.nextDouble();

        double area = pi * radius * radius;
        System.out.println(area);


        //Quesiton 3: Take a input of an interger number from the user and then output the times table of that given number
        int mulValue = 0; 
        
        System.out.println("Pleaes input a integer number for which you would like times table for: ");
        Scanner sc4 = new Scanner (System.in);
        mulValue = sc4.nextInt();

        System.out.println(mulValue * 1);
        System.out.println(mulValue * 2);
        System.out.println(mulValue * 3);
        System.out.println(mulValue * 4);
        System.out.println(mulValue * 5);
        System.out.println(mulValue * 6);
        System.out.println(mulValue * 7);
        System.out.println(mulValue * 8);
        System.out.println(mulValue * 9);
        System.out.println(mulValue * 10);


        //closing the scanner
        sc.close();
        sc2.close();
        sc3.close();
        sc4.close();
    }
}
