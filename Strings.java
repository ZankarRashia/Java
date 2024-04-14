import java.util.*;

public class Strings {
    public static void main(String args[]) {
        //String Declaration 
        String myName = "Zankar Rashia";
        String fullName = "Riddhi Patel";
        String sentence = "My name is Zeetans";

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //next only takes one word line takes the whole sentence with spaces 
        System.out.println("Your name is: "+ name);

        //Concatenation
        String newName = myName + " " + fullName; 
        System.out.println(newName);

        //Length of a string
        System.out.println(newName.length());

        //charAt
        for(int i = 0; i < newName.length(); i++) {
            System.out.println(newName.charAt(i));
        }

        // compare two strings
        if(myName.compareTo(fullName) == 0) {
            System.out.println("Both names are same");
        } else {
            System.out.println("Both are not same");
        }

        if( new String("Zankar Rashia") == new String("Zankar Rashia")) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are NOT equal");
        }

        //Substring 
        //substring(beg index, end index)
        String petName = sentence.substring(8, sentence.length());
        System.out.println(petName);

        //String Builder
        StringBuilder sb = new StringBuilder("Zankar");
        System.out.println(sb);

        //character at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0, 'J');
        System.out.println(sb);

        //Insert chart at index 0
        sb.insert(0, 'S');
        System.out.println(sb);

        //Delete chart at index 0
        sb.delete(0, 3);
        System.out.println(sb);

        //Append chart at the last index
        sb.append('r');
        System.out.println(sb);

        //Length of the string builder
        System.out.println(sb.length());


        //Question: Reverse string
        //"hello" == "olleh"
        //"tony" == "ynot"

        
        StringBuilder test = new StringBuilder("Zankar");
        
        for(int i = 0; i < test.length() / 2; i++) {
            int front = i; 
            int back = test.length() - 1 - i;

            char frontChar = test.charAt(front);
            char backChar = test.charAt(back);

            test.setCharAt(front, backChar);
            test.setCharAt(back, frontChar);
        }
        
        System.out.println(test);
    }
}
