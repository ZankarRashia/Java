import java.util.*;

public class StackClass {

    //template for the node
    static class Node {
        int data;
        Node next;
        public  Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        //head creation
        public static Node head;

        //funcion to check if the stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        //function to push  an element in the stack
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //function to pop an element from the stack
        public static int pop() {

            //base case for empty stack
            if(isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //function to peek an element from the stack
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack stack1 = new Stack();
        stack1.push(0);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        while(!stack1.isEmpty()) {
            System.out.println(stack1.peek());
            stack1.pop();
        }
    }
}
