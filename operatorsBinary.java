import java.util.*;

public class operatorsBinary {
    public static void main(String args[]) { 

        //Bit Manipulation 
        //Lecture 15 of the notes in notebook
        int n = 5; //0101
        int pos = 1; 
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNotBitMask = notBitMask & n;
        System.out.println(newNotBitMask);

        int newNumber = bitMask | n;
        System.out.println(newNumber);
        
        if((bitMask & n) == 0) {
            System.out.println("Bit was Zero");
        } else {
            System.out.println("Bit was One");
        }

        Scanner sc = new Scanner(System.in);
        int operationB = sc.nextInt();

        if(operationB == 1) {
            //Set
            int newBitMask = bitMask | n; 
            System.out.println(newBitMask);

        } else {
            //Clear
            int newBitMask = ~(bitMask); 
            int newBitUserMask = newBitMask & n;
            System.out.println(newBitUserMask);
        }
        //int operationB = 1; //Update bit to 1 else update bit to 0
    }
}
