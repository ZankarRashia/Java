import java.util.*;

//stack using framework
public class StackClass3 {

    public static void pushAtBottom(int data, Stack<Integer> stack) {
        
        //base case
        if(stack.isEmpty()) { 
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }

    //reverse a stack
    public static void reverse(Stack<Integer> stack) {

        //base case
        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        pushAtBottom(top, stack);
    }

    public static void main(String args[]) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        reverse(stack1);
        while(!stack1.isEmpty()) {
            System.out.println(stack1.peek());
            stack1.pop();
        }
    }
}
