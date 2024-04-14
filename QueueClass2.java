import java.util.*;

public class QueueClass2 {

    static class Queue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        public static boolean isEmpty() {
            return stack1.isEmpty();
        }

        public static void add(int data) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(data);

            while(!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return stack1.pop();
        }

        public static int peek() {
            if(isEmpty())  {
                System.out.println("Empty queue");
                return -1;
            }

            return stack1.peek();
        }
    }
    public static void main(String[] args) {
       // Queue<Integer> queue1 = new LinkedList<>();
       Queue queue1 = new Queue();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);

        while (!queue1.isEmpty()) {
            System.out.println(queue1.peek()); // 5,  4, 3, 2, 
            queue1.remove();
        }
    }
}
