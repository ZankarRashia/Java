  import java.util.*;
public class Arrays2D {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];
        //Matrix input
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.println("Enter a number: ");
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a number to seach it at a given index: ");
        int searchX = sc.nextInt();
        
        //Linear(2D) Search 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(numbers[i][j] == searchX) {
                    System.out.println("Index of a number: " + searchX + " at " + i + " " + j);
            }
        }

       /* //Matrix output
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){ 
            System.out.print (numbers[i][j] + " "); 
        }
        System.out.println();
        */
        }
    }
}