import java.util.*;

public class Recursion {

    //Advanced recursion Pt - 3
    //Print all the subsets of a set of first 'n' natural numbers
    public static void printSubsets(ArrayList<Integer> subset) { 
        for(int i =- 0; i<subset.size(); i++) {
            System.out.println(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
    
        //Base case
        if (n == 0) { 
            System.out.println(subset);
            return;
        }

        //Add
        subset.add(n);
        findSubsets(n - 1, subset);

        //Will not be added
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);
    }

    //Find the number of ways in which you can invite 'n' people to your party, single or in pairs
    public static int callGuests(int n) {

        //Base case
        if(n <= 1) {
            return 1;
        }

        //Single 
        int ways1 = callGuests(n - 1);

        //Pair
        int ways2 = (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }

    //Place tiles of size 1 * m in a floor of size n * m
    public static int placeTiles(int n, int m) {

        //Base case
        if(n == m) {
            return 2;
        }

        if(n < m) {
            return 1;
        }

        //Vertically
        int vertiPlacements = placeTiles(n - m, m);

        //Horizontally 
        int horiPlacements = placeTiles(n - 1, m);

        return vertiPlacements + horiPlacements;
    }

    //Count the total paths in a maze
    public static int countPaths(int i, int j, int n, int m) {
        
        //Base Case
        if(i == n || j == m) {
            return 0;
        } 
        
        if(i == n - 1 && j == m - 1) {
            return 1;
        }

        //move downwards
        int downPaths = countPaths(i + 1, j, n, m);

        //move right 
        int rightPaths = countPaths(i, j + 1, n, m);

        return downPaths + rightPaths;
    }
    
    //Permutations of the string
    public static void printPerm(String str, String permutation) {
        
        //Base case
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            //"abc" - > "ab"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permutation + currentChar);
        }
    }

    //Intermidiate recursion Pt - 2 
    //Tower of Hanoi
    public static void towerOfHanoi(int nSteps, String src, String helper, String dest) {
        
        //Base case
        if(nSteps == 1) {
            System.out.println("Transfer disk: " + nSteps + " from " + src + " to " + dest);
            return;
        }
        //Logic for more than 1 disks
        towerOfHanoi(nSteps - 1, src, dest, helper);
        System.out.println("Transfer disk: " + nSteps + " from " + src + " to " + dest);
        towerOfHanoi(nSteps - 1, helper, src, dest);
    }
    //Reverse a string
    public static void printReverse(String str, int idx) {

        //Base Case
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printReverse(str, idx - 1);
    }
    //Find the 1st & last occurance of an element
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        //Base case
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentChar = str.charAt(idx);
        if(currentChar == element) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurance(str, idx + 1, element);
    }

    //Check if an array is sorted(strictly increasing)
    public static boolean isSorted(int arr[], int idx) {

        // Base case: we've checked all elements
        if(idx == arr.length - 1) {
            return true;
        }
        // If this pair isn't strictly increasing, then it's not sorted
        if(arr[idx] < arr[idx+1]) {
            //Array is sorted till' now
            return isSorted(arr, idx + 1);
            } else {
                return false;
            }
    }

    //Move all 'x' to the end of the string 
    public static  void moveAllXToEnd(String str, int idx, int count, String newString) {

        //Base case
        if(idx == str.length()) {
            for(int i = 0; i < count; i++) {
                newString += "x";
            }
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);
        if(currentChar == 'x') {
            count++;
            moveAllXToEnd(str, idx + 1, count, newString);
        } else {
            newString += currentChar; //newString = newString + currentChar
            moveAllXToEnd(str, idx + 1, count, newString);
        }
    }

    //Remove duplicates in a string
    public static boolean[] map = new boolean[26];

    public static void  removeDuplicates(String str, int idx, String newString) {
        
        //Base case
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a']) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            newString+=currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }
     //Print all the subsequences of a string 
    public static void subsequences(String str, int idx, String newString) {

    //Base case 
    if(idx == str.length()) {
        System.out.println(newString);
        return;
    }

    char currentChar = str.charAt(idx);

    //To be 
    subsequences(str, idx + 1, newString + currentChar);

    //Or NOT to be
    subsequences(str, idx + 1, newString);
}
    //Print all the unique subsequences of a string
     //Print all the subsequences of a string 
     public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {

        //Base case 
        if(idx == str.length()) {
            if(set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentChar = str.charAt(idx);

        //To be 
        uniqueSubsequences(str, idx + 1, newString + currentChar, set);

        //Or NOT to be
        uniqueSubsequences(str, idx + 1, newString, set);
    }
    // Print Keypad Combinations

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination) {
        
        //Base case 
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = str.charAt(idx);
        String mapping = keypad[currentChar - '0'];

        for (int i=0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }
    //Basic recursion Pt - 1 
    //Calculate X^n stack height in logs
    public static int calculatePowerLog(int x, int powerN) {
        //Base cases (2 of them)
        if(powerN == 0) { // base case 1
            return 1;
        }

        if(x == 0) { // base case 2
            return 0;
        }

        //Work
       if(powerN % 2 == 0) { // for even
            return calculatePowerLog(x, powerN/2) * calculatePowerLog(x, powerN / 2);
       } else { // for odd
            return calculatePowerLog(x, powerN / 2) * calculatePowerLog(x, powerN / 2) * x;
       }
    } 
    //Calculate X^n stack height = n
    public static int calculatePower(int x, int powerN) {
        //Base cases (2 of them)
        if(powerN == 0) { // base case 1
            return 1;
        }

        if(x == 0) { // base case 2
            return 0;
        }

        //Work
        int xPowerNm1 = calculatePower(x, powerN - 1);
        int xPowerN = x * xPowerNm1;
        return xPowerN;
    }
    //Calculate Fibonacci Sequence
    public static void printFib(int a, int b, int number) {
        
        if(number == 0) {
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFib(b, c, number - 1);
    }
    //Calculate Factorial
    public static int calculateFactorial(int number) {
        
        if(number == 1 || number == 0) { //Base case
            return 1;
        }
        
        int factorial_number1 = calculateFactorial(number - 1);
        int factorial_number = number * factorial_number1;
        return factorial_number;
    }
    //Print 5 -> 1 
    public static void printIncrementingNumber(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printIncrementingNumber(n-1);
    }
    //Print 1 -> 5
    public static void printDecrementingNumber(int nn) {
        if(nn == 6) {
            return;
        }
        System.out.println(nn);
        printDecrementingNumber(nn+1);
    }
    //Print the sum of 'n' natural numbers
    public static void printSum(int index, int number, int sum) {
        if(index == number) {
            sum += index;
            System.out.println("The sum is " + sum);
            return;
        }
        sum += index;
        printSum( index + 1, number, sum);
        System.out.println(index);
    }
    public static void main(String args[]) {

        //Basic recursion Pt - 1 
        //Question 1: Print numbers from 5 to 1 in decreasing order
        int n = 5; 
        printIncrementingNumber(n);

        System.out.println();

        //Question 2: Print numbers from 1 to 5 in ascending  order
        int nn = 1;
        printDecrementingNumber(nn);
        
        System.out.println();

        //Question 3: Print SUM of first 'n' natural numbers 
        printSum(1, 5, 0);

        System.out.println();

        //Question 4: Print Factorial of a number 'n'
        int factorialNum = 5;
        int ans = calculateFactorial(factorialNum);
        System.out.println(ans);

        System.out.println();

        //Question 5: Print the fibonacci sequence till 'nth' term
         int a = 0, b = 1, numFib = 7;
         System.out.println(a);
         System.out.println(b);
         printFib(a, b, numFib - 2);

        System.out.println(); 

        //Question 6: Print x^n(stack height = n)
        int xNumber = 2, powerNumber = 5;
        int finalHeight = calculatePower(xNumber, powerNumber);
        System.out.println(finalHeight);

        System.out.println();

        //Question 7:  Print x^n(stack height = log(n))
        int xNumberLog = 2, powerNumberLog = 5;
        int finalHeightLog = calculatePowerLog(xNumberLog, powerNumberLog);
        System.out.println(finalHeightLog);

        System.out.println();

        //Intermidiate recursion Pt - 2
        //Question 1: Tower of Hanoi 
        int nSteps = 3; 
        towerOfHanoi(nSteps, "S", "H", "D");
        
        System.out.println();

        //Question 2: Reverse a string
        String reverseString = "abcd";
        printReverse(reverseString, reverseString.length() - 1);

        System.out.println();

        //Question 3: Find the 1st & last occurance of an element in string
        String firstOccurance = "abaacdaefaah";
        findOccurance(firstOccurance, 0, 'a');

        System.out.println();

        //Question 4: Check if an array is sorted(strictly increasing)
        int arr[] = {1, 3, 3};
       System.out.println(isSorted(arr, 0));

       System.out.println();

       //Quetion 5: Move all 'x' to the end of the string 
       String str = "axbcxxd";
       moveAllXToEnd(str, 0, 0, "");

       System.out.println();

       //Question 6: Remove duplicates in a string
       String str1 = "abbccda";
       removeDuplicates(str1, 0, "");

       System.out.println();

       //Question 7: Print all the subsequences of a string 
       String str2 = "abc";
       subsequences(str2, 0, "");

       System.out.println();

       //Question 8: Print all the unique subsequences of a string 
       String str3 = "aaa";
       HashSet<String> set = new HashSet<>();
       uniqueSubsequences(str3, 0, "", set);

       System.out.println();

       //Question 9: Print Keypad Combinations
        String  keypad = "4";
        printComb(keypad, 0, "");

        System.out.println();

        //Advanced recursion Pt - 3 
        //Question 1: Print all permutations of a string "abc" n! 
        String permString = "abc";
        printPerm(permString, "");

        System.out.println();

        //Question 2: Count total paths in a maze to move from (0,0) to (n,m)
        int row = 3, col = 3;
        int totalPaths = countPaths(0, 0, row, col);
        System.out.println(totalPaths);

        System.out.println();

        //Question 3: Place tiles of size 1 * m in a floor of six n * m
        System.out.println(placeTiles(row, col));

        System.out.println();

        //Question 4: Find the number of ways in which you can invite 'n' people to your party, single or in pairs
        int numOfGuests = 4;
        System.out.println(callGuests(numOfGuests));

        System.out.println();

        //Question 5: Print all the subsets of a set of first 'n' natural numbers
        int numOfNatural = 3; 
        ArrayList <Integer> subset = new ArrayList<>();
        findSubsets(numOfNatural, subset);
    }
}
