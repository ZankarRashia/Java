import java.util.*;

public class Functions {

    //Function to calculate factorial of a number
    public static void returnTheFactorial(int num1) {

        if(num1 < 0) {
            System.out.println("Sorry, factorial does not exist for negative numbers");
            return;
        }
        int fact = 1;
        for(int i = num1; i>=1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }
    //Funciton to mul two numbers and return the product
    public static int returnTheProduct(int num1, int num2) {
        return (num1 * num2);
    }
    //Function to add two numbers and return the sum
    public static int returnTheSum(int num1, int num2) {
        return (num1 + num2);
    }

    //Function to print name
     public static void printMyName(String myName) {
            System.out.println(myName);
            return;
        }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); 
        
        //Calling the function
        printMyName(name);

        sc.close();

        int riddhi = 6; 
        int zankar = 9;
        System.out.println(returnTheSum(riddhi, zankar));
        System.out.println(returnTheProduct(riddhi, zankar));
        returnTheFactorial(riddhi);
    }
}
