import java.util.Scanner;

public class bai_tap_tinh_tong_cac_so_o_mot_cot_xac_dinh {
    public static void main(String[] args) {
        int size;
        int[][] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số lượng hàng của ma trận: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số lượng hàng không được vượt quá 20. Vui lòng nhập lại.");
            }
        } while (size > 20);
        array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử thứ [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        // In ma trận đã nhập
        System.out.println("Ma trận đã nhập: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        // Tính tổng các số ở một cột xác định
        int columnIndex;
        do {
            System.out.print("Nhập vào chỉ số cột cần tính tổng: ");
            columnIndex = sc.nextInt();
            if (columnIndex >= size) {
                System.out.println("Chỉ số cột không hợp lệ. Vui lòng nhập lại.");
            }
        } while (columnIndex >= size);

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i][columnIndex];
        }

        // In tổng các số ở cột xác định
        System.out.println("Tổng các số ở cột " + columnIndex + " là: " + sum);
    }
}
