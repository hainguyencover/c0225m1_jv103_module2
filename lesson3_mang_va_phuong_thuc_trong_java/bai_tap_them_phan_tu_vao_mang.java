import java.util.Arrays;
import java.util.Scanner;

public class bai_tap_them_phan_tu_vao_mang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Value: " + Arrays.toString(array));
        System.out.print("Nhập phần tử cần thêm: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int index = sc.nextInt();
        if (index < 0 || index > array.length - 1) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = x;
            System.out.println("New value: " + Arrays.toString(array));
        }
    }
}
