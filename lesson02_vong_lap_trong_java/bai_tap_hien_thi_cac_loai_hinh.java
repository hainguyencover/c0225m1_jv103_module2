import java.util.Scanner;

public class bai_tap_hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println(
                "2. Print the square triangle \n   + top-left\n   + top-right\n   + botton-left\n   + botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Top-left triangle");
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("Top-right triangle");
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  ");

                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("Bottom-left triangle");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                System.out.println("Bottom-right triangle");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  ");

                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Isosceles triangle");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= (2 * i - 1); k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice");
                break;
        }
    }
}
