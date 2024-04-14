import java.util.ArrayList;

//stacks using arraylist
public class StackClass2 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push function 
        public static void push(int data) {
            list.add(data);
        }

        //pop function
        public static int pop() {

            //base to check if the array list is empty
            if(isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek function
        public static int peek() {
            if(isEmpty()) {
                return -1; 
            }
            return list.get(list.size() - 1);
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
