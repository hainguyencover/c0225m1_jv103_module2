import java.util.Scanner;

public class thuc_hanh_tim_gia_tri_lon_nhat_trong_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng phần tử của mảng: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Số lượng phần tử không được vượt quá 20. Vui lòng nhập lại.");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        // In mảng đã nhập
        System.out.print("Mảng đã nhập: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        // Tìm giá trị lớn nhất trong mảng
        int max = array[0];
        int index = 1;
        // Tìm vị trí của giá trị lớn nhất
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        // In giá trị lớn nhất
        System.out.println("\nGiá trị lớn nhất trong mảng là " + max + ", tại vị trí " + index );
    }
}
