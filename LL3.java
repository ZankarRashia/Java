import java.util.*;

class LL3 {
    Node head; // head of list

    class Node {
        int data;
        Node next; 

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Add last
    public void addLast(int data) {
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

    public void reverseIterate() {

        Node pervNode = head;
        Node currNode = head.next;

        if(head == null || head.next == null) {
            return;
        }

        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = pervNode;

            //Update curr, prev node
            pervNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = pervNode;
    }

    //Recursively reversing Linked List
    public Node reverseRecursive(Node head) {

        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next); 
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String args[]) {
        LL3 list = new LL3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverseIterate();
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
