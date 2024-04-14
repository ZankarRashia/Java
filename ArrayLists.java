import java.util.*;
import java.util.ArrayList;

class ArrayLists {
    public static void main(String args[]) {
       // Integer | Float | String | Boolean 
        ArrayList<Integer> list = new ArrayList<Integer>();
       // ArrayList<String> list2 = new ArrayList<String>();
       // ArrayList<Boolean> list3  = new ArrayList<Boolean>();

       //add elements 
       list.add(0);
       list.add(2);
       list.add(3);
       System.out.println(list);

       //get elements
      int element = list.get(0);
      System.out.println(element + " is at index 0");

      //add element in between
      list.add(1,1);
      System.out.println(list);

      //set element 
      list.set(0,5);
      System.out.println(list);

      //delete element 
      list.remove(3);
      System.out.println(list);

      //size of arraylist
      int size = list.size();
      System.out.println(size);


      //iterate //loops
      for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
        }
      System.out.println();
      
      //sorting
      Collections.sort(list);
      System.out.print(list);
    }
}
