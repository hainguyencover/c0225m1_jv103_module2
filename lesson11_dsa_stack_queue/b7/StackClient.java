package b7;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("1. Size of stack push operation: " + stack.size());
        System.out.print("2.Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operations: " + stack.size());
    }
}