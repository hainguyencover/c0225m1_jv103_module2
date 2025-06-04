package b01;

public class GenericStackClient {
    public static void stackOfIsStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after pushing operations: " + stack.size());
        System.out.print("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after popping operations: " + stack.size());
    }

    public static void stackOfIsIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after pushing operations: " + stack.size());
        System.out.print("2.2 Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n2.3 Size of stack after popping operations: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of Strings:");
        stackOfIsStrings();
        System.out.println("\n2. Stack of Integers:");
        stackOfIsIntegers();
    }
}
