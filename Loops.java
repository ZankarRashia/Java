import java.util.*;


public class Loops {
    public static void main(String args[]) {

        //for loops
        for(int i = 0; i < 100; i++) {
            System.out.println("Hello World");
        }

        for(int i = 0; i < 11; i++) {
            System.out.println(i);
        }

         //while loops
        int i = 0;
        while(i <11) {
            System.out.println(i);
            i++;
        }

        //do while
        int z = 0;

        do{
            System.out.println(z);
            z++;
        } while(z < 11);


        //homework

        //Question 1: Print the sum of first 'n' natural numbers
        
        int n = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int j = 1; j <= n; j++) {
            sum = sum + i; 
        }
        System.out.println(sum);


        //Quesiton 2: Print the table of a number input by the user
        Scanner sc1 = new Scanner(System.in);
        int mul = sc1.nextInt();

        for(int j = 1; j <= 10; j++) {
            System.out.println(mul * j);
        }


        //closing the scanner
        sc.close();
        sc1.close();
    }
}
