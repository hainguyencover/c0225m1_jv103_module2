import java.util.Scanner;

public class bai_tap_mang_hai_chieu_tinh_tong_duong_cheo_cua_ma_tran_vuong {
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
        // Tính tổng các số ở đường chéo chính
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i][i];
        }

        // In tổng các số ở đường chéo chính
        System.out.println("Tổng các số ở đường chéo chính là: " + sum);
    }
}
