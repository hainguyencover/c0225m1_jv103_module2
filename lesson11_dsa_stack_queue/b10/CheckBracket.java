package b10;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean isValidExpression(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (char sym : expression.toCharArray()) {
            // Nếu gặp dấu ngoặc mở thì đẩy vào stack
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            }

            // Nếu gặp dấu ngoặc đóng
            else if (sym == ')' || sym == '}' || sym == ']') {
                // Stack rỗng => thiếu ngoặc mở
                if (bStack.isEmpty()) {
                    return false;
                }

                char left = bStack.pop(); // Lấy ngoặc mở gần nhất ra để so khớp

                // Kiểm tra cặp ngoặc có hợp lệ không
                if ((sym == ')' && left != '(') ||
                        (sym == '}' && left != '{') ||
                        (sym == ']' && left != '[')) {
                    return false;
                }
            }
        }

        // Nếu sau khi kiểm tra xong mà Stack vẫn còn phần tử => thừa ngoặc mở
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap bieu thuc can kiem tra dau ngoac:");
        String input = scanner.nextLine();

        if (isValidExpression(input)) {
            System.out.println("Bieu thuc dung dau ngoac dung!");
        } else {
            System.out.println("Bieu thuc dung dau ngoac sai!");
        }

        scanner.close();
    }
}
