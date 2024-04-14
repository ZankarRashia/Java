public class QueueClass1 {

    //queues using linked list
    static class Node {
        int data; 
        Node next;


        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //enqueue
        public static void add(int data) {
            Node newNode = new Node(data);

           // 1st element
            if(tail == null) {
                tail = head = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //dequeue
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;

            //base casae for one node
            if(head == tail) {
                tail = null;
            }

            head = head.next;

            return front;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            } 

            return head.data;
        }


    }
    
    public static void main(String args[]) {
        Queue queue1 = new Queue();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);  
        queue1.add(4);
        queue1.add(5);

        while(!queue1.isEmpty()) {
            System.out.print(queue1.peek() + " ");
            queue1.remove();
        }
        
        
    }
}
