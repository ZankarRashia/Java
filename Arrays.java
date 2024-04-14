import java.util.*;

public class Arrays {
    public static void main(String args[]) {

      /*   //Defining arrays 1st Way
        int marks[] = new int[3];
        marks[0] = 98; // chem
        marks[1] = 97; // phy
        marks[2] = 95; // eng

        System.out.println(marks);
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        
        for(int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        //Defining arrays 2nd Way
        int grades[] = {98, 97, 95};

        for(int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        //Defining arrays 3rd Way
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size]; 

        //Scanning inputs in
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        //Printing outputs out
        for(int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
        */

        //Do it on your own: 
        //Take an array as an input from the user.
        //Search for a given number 'x' 
        //Print the index at which it occurs
        Scanner sc1 = new Scanner(System.in);
        int sizeOfArray = sc1.nextInt();
        int zankar[] = new int[sizeOfArray];

        for(int i = 0; i < sizeOfArray; i++) {
            zankar[i] = sc1.nextInt();
        }

        System.out.println("Please input the number you would like to search: ");
        Scanner sc2 = new Scanner(System.in);
        int searchNumber = sc2.nextInt();

        for(int i = 0; i < zankar.length; i++) {
            if (zankar[i] == searchNumber) { 
                System.out.println("The number " + searchNumber + " is found at position " + i); 
            }
        }
    }
}
