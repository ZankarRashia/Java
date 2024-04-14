import java.util.*;


public class Conditionals {
    public static void main(String args[]) {

        //if and if-else
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Not an Adult");
        }
        //closing the scanner
        sc.close();

        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();
    
        //closing the scanner
        sc1.close();

        if(x % 2 == 0) {
            System.out.println("Even number.");
        }
        else {
            System.out.println("Odd number");
        }

        Scanner sc3 = new Scanner(System.in);
        int a = sc3.nextInt();
        Scanner sc4 = new Scanner(System.in);
        int b = sc4.nextInt();

        if(a == b) {
            System.out.println("Equal");
        }
        else if (a > b) {
            System.out.println("A is greater");
        }
        else {
            System.out.println("A is lesser");
        }

        //closing the scanner
        sc3.close();
        sc4.close();

        //Break
        Scanner sc5 = new Scanner(System.in);
        int z = sc5.nextInt();

        switch(z) {
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Kem cho");
            break;

            case 3: System.out.println("Kaise ho");
            break;

            default: System.out.println("Como Estas");
            break;
        }

        //closing the scanner
        sc5.close();
        //Homework
        //Make calcultor take 2 numbers a & b from the user and an operation as follows

        Scanner sc6 = new Scanner(System.in);
        int num1 = sc6.nextInt();

        Scanner sc7 = new Scanner(System.in);
        int num2 = sc7.nextInt();

        Scanner sc8 = new Scanner(System.in);
        int operation = sc8.nextInt();

        switch(operation) {
            case 1 : System.out.println(num1 + num2);
            break;

            case 2 : System.out.println(num1 - num2);
            break;

            case 3 : System.out.println(num1 * num2);
            break;

            case 4 : System.out.println(num1 / num2);
            break;

            case 5 : System.out.println(num1 % num2);
            break;
        }
        //closing the scanner
        sc6.close();
        sc7.close();
        sc8.close();
        
    }
}
