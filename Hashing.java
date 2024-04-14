import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    
    public static void main(String args[]) {

        //Creating 
        HashSet<Integer> set = new HashSet<>();
        
        //Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        
        //Search - contains
        if(set.contains(1)) {
            System.out.println("Number is present");
        }

        if(!set.contains(6)) {
            System.out.println("Does not contain");
        }

        //Delete - remove
        //set.remove(1);
        if(!set.contains(1)) {
            System.out.println("Does not contain; it is removed.");
        }

        //size of the set
        System.out.println( "Size: " + set.size());

        //Printing all the elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //System.out.println(it.hasNext());

    }
}
