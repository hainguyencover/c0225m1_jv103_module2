package b3;

public class GenericStackClient {
    public static void stackOfIsStrings() {
        int[] arr = { 5, 4, 3, 2, 1 };
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        for (int num : arr) {
            stack.push(num);
        }
        System.out.print("Cac phan tu trong stack: ");
        for (int num : stack.get()) {
            System.out.printf(" %d", num);
        }
        System.out.println();
        System.out.print("Mang sau khi dao nguoc: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
    }

    public static void stackOfIsIntegers() {
        String sentence = "Xin chao CodeGym!";
        MyGenericStack<String> wStack = new MyGenericStack<>();
        System.out.println("Chuoi ban dau: " + sentence);
        // Tách từ bằng split
        String[] words = sentence.split(" ");
        for (String word : words) {
            wStack.push(word);
        }
        // Nối từ ngược lại
        StringBuilder outp = new StringBuilder();
        while (!wStack.isEmpty()) {
            outp.append(wStack.pop()).append(" ");
        }
        // In chuỗi sau khi đảo
        System.out.println("Chuoi sau khi dao tu: " + outp.toString().trim());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of Integers:");
        stackOfIsStrings();
        System.out.println("\n2. Stack of Integers:");
        stackOfIsIntegers();
    }
}
