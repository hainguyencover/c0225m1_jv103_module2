import java.util.Scanner;

public class bai_tap_tim_min_trong_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        int minIndex = findMinIndex(arr);
        System.out.println("Vi tri cua gia tri nho nhat: "  + minIndex);
    }

    public static int findMinIndex(int[] arr) {
        int min = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Gia tri nho nhat la: " + min);
        return index;
    }
}
