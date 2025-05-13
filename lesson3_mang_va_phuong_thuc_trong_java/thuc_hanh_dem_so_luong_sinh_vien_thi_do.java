import java.util.Scanner;

public class thuc_hanh_dem_so_luong_sinh_vien_thi_do {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào điểm của tối đa 30 sinh viên: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Số lượng sinh viên không được vượt quá 30. Vui lòng nhập lại.");
            }
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        // In mảng đã nhập
        System.out.print("Mảng đã nhập: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        // Tính số lượng sinh viên thi đỗ
        int count = 0;
        for (int value : array) {
            if (value >= 5) {
                count++;
            }
        }
        // In số lượng sinh viên thi đỗ
        System.out.println("\nSố lượng sinh viên thi đỗ là: " + count);
        // In số lượng sinh viên thi trượt
        System.out.println("Số lượng sinh viên thi trượt là: " + (size - count));
    }
}
