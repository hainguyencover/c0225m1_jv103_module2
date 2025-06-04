import java.util.Scanner;

public class thuc_hanh_tim_uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = input.nextInt();
        System.out.println("Nhập số b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung lớn nhất");
            return;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Ước số chung lớn nhất là: " + a);
    }
}
