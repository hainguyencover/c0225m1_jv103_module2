import java.util.Scanner;

public class thuc_hanh_kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " là số nguyên tố");
            } else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
