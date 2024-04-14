import java.util.*;

//using framework
class LL2 {
    
    public static void main(String args[]) {
        LinkedList<String> list  = new LinkedList<String>();  // Create a linked 

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("This");
        list.addLast("list"); //if you add just add it will by default add the node at the end of the list
        System.out.println(list);

        System.out.println(list.size() + " elements are in the list.");

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ->  ");
        }

        System.out.println("NULL");

        list.remove(3);
        System.out.println(list);

    }
}
