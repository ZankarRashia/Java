import java.util.*;

public class BestPatterns {
    public static void main(String args[]) {
    
    //Problem 1: nested loops print the patters Solid Rectangle 
    //Solution:
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    
    Scanner sc1 = new Scanner(System.in);
    int col = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    
        //closing scanners
        sc.close();
        sc1.close();

    System.out.println();

    //Problem 2: print the pattern Hollow Rectangle
    //Solution: 
    int n = 4; 
    int m = 5;
        for(int i = 1; i <= n; i++) { 
            for(int j = 1; j <=m; j++){
                if(i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    System.out.println();

    //Problem 3: Print the Half-Pyramid
    int z = 4; //number of rows
        for(int i = 1; i <= z; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    System.out.println();

    //Problem 4: Print the Inverted-Half-Pyramid
    int ro = 4; 
        for(int i = ro; i >= 1; i--){
            for(int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    System.out.println();

    //Problem 5: Print the Inverted-Half-Pyramid rotated by 180* degree
    int roo = 4;
        for(int i = 1; i <= roo; i++) {
            //inner loop -> space print
            for(int j = 1; j <= roo - i; j++) {
                System.out.print(" ");
            } 
            
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    System.out.println();

    //Problem 6: Print the Half-Pyramid with Numbers
    int rooo = 5;
        for(int i = 1; i <= rooo; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
    System.out.println();

    //Problem 7: Print the Inverted-Half-Pyramid with Numbers 1st way
    int roooo = 5;
        for(int i = roooo; i >= 1; i--) {
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    System.out.println();

    //Problem 7: Print the Inverted-Half-Pyramid with Numbers 2nd way
        for(int i = 1; i <= roooo; i++) {
            for(int j = 1; j <= roooo - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    System.out.println();

    //Problem 8: Print the Floyd's Triangle
    int counter = 1; 
        for(int i = 1; i <= roooo; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    System.out.println();

    //Problem 9: Print 0-1 Triangle 
        for(int i = 1; i <= roooo; i++) {
            for(int j = 1; j <= i; j++) {
                int sum = i + j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    System.out.println();

     //Problem 10: Print the Butterfly Pattern
    int riddhi = 4; 

        //Upper Half
        for(int i = 1; i <= riddhi; i++) {
            //1st Part '*'
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Space
            int spaces = 2 * (riddhi - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd Part '*'
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower Half
        for(int i = n; i >= 1; i--) {
            //1st Part '*'
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Space
            int spaces = 2 * (riddhi - i);
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //2nd Part '*'
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    System.out.println();

    //Problem 11: Print the Solid Rhombus
    // roooo = 5;
        for(int i = 1; i <= roooo; i++) {
            //Spaces
            for(int j = 1; j <= roooo - i; j++) {
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    System.out.println();

    //Problem 12: Print the Number Pyramid
        for(int i = 1; i <= roooo; i++){
            //Spaces
            for(int j = 1; j <= roooo - i; j++) {
                System.out.print(" ");
            }
            //Numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    
    System.out.println();

    //Problem 13: Print the Palendromic Pattern
        for(int i = 1; i <= roooo; i++) {
            //Spaces
            for(int j = 1; j <= roooo - i; j++) {
                System.out.print(" ");
            }

            //1st Half-Numbers
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            //2nd Half-Numbers
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    
    System.out.println();

    //Problem 14: Print the Diamond Patter
    roooo = 4;
        //Upper-Half
        for(int i = 1; i <= roooo; i++) {
            //Spaces
            for(int j = 1; j <= roooo - i; j++) {
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lowwer-Half
        for(int i = roooo; i >= 1; i--) {
            //Spaces
            for(int j = 1; j <= roooo - i; j++) {
                System.out.print(" ");
            }
            //Stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}