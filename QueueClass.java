import java.util.*;

public class QueueClass {
    
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        public Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        //is empty to check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1; //second condition is added for the implementation of circular queue
        }

        //isfull to check to check for circular queue
        private static boolean isFull() { 
            return (rear + 1) % size == front;
        }

        //ADD //enqueue
        public static void add(int data) {
            if(isFull()) { //rear == size - 1 //condition for array queue isfull is used for circular queue
                System.out.println("Queue is full");
                return;
            }

            //add 1st element add
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1)  % size;
            arr[rear] = data;
        }

        //remove dequeue
        public static int remove() {
            if(isEmpty()) { 
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
    
            return front;
        }

        //Peek 
        public static int peek() {
            if(isEmpty()) { 
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }


    public static void main(String args[]) {
        Queue queue1 = new Queue(5);
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);  
        queue1.add(4);
        queue1.add(5);
        System.out.println(queue1.remove());

        queue1.add(6);
        System.out.println(queue1.remove());

        queue1.add(7);


        while(!queue1.isEmpty()) {
            System.out.print(queue1.peek() + " ");
            queue1.remove();
        }
    }
}
