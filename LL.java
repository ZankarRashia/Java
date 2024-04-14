import java.util.*;

class LL {

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Add - First
    public void addAtFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        } 

        newNode.next = head;
        head = newNode;
    }

    //Add Last 
    public void addAtLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Delete First
    public void deleteFirst() {
        if(head == null) {
            System.out.println("This list is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete Last
    public void deleteLast() {
        if(head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        size--; 

        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; //head.next = null -> lastNode = n
        while(lastNode.next !=null){ //null.next will give error
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    //Size of LL
    public int getSize(){ 
        return size;
    }

    //Print LL 
    public void printList() {
        if(head == null) {
            System.out.print("The list is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addAtFirst("a");
        list.addAtFirst("is");
        list.printList();

        list.addAtLast("list");
        list.printList();

        list.addAtFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addAtFirst("This");
        System.out.println(list.getSize());
    }
}
