import java.util.Scanner;

public class thuc_hanh_dao_nguoc_cac_phan_tu_cua_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập các phần tử của mảng: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số lượng phần tử không được vượt quá 20. Vui lòng nhập lại.");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        // In mảng đã nhập
        System.out.print("Mảng đã nhập: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        // Đảo ngược mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        // In mảng đã đảo ngược
        System.out.println("\nMảng đã đảo ngược: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
