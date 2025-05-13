import java.util.Arrays;
import java.util.Scanner;

public class bai_tap_xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int[] newArray = new int[array.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Value: " + Arrays.toString(array));
        while (true){
            System.out.print("Nhập phần tử cần xóa: ");
            int x = sc.nextInt();
            int index = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] != x) {
                    newArray[index] = array[i];
                    index++;
                }
            }
            newArray[index] = array[array.length - 1];
            // In mảng mới
            if (index == array.length - 1) {
                System.out.println("Không có phần tử nào trong mảng");
            } else {
                System.out.println("New value: " + Arrays.toString(newArray));
                break;
            }

        }


    }
}
