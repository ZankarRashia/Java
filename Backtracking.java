import java.util.*;

public class Backtracking {
    public static void printPermutation(String str, String permu, int index) {

        //Base case
        if(str.length() == 0) {
            System.out.println(permu);
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permu + currChar, index);
        }
    }
    public static void main(String args[]) { 
        
        //Question 1: Arrange them in a single line
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}
