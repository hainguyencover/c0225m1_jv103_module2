package b09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        String cleanInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (char c : cleanInput.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi can kiem tra: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Chuoi la Palindrome");
        } else {
            System.out.println("Chuoi KHONG phai la Palindrome");
        }
    }
}
