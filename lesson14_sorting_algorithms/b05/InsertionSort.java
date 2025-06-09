import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        System.out.println("Bat dau mang: " + Arrays.toString(array));
        int pos, x;
        for (int i = 1; i < n; i++) { // đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            System.out.println("Buoc " + i + ": " + Arrays.toString(array));
        }
        System.out.println("Hoan thanh: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 6 };
        insertionSort(array);
    }
}
