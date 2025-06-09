import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        System.out.println("Bat dau mang: " + Arrays.toString(array));
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;

            System.out.println("Buoc " + i + ": " + Arrays.toString(array));
        }
        System.out.println("Hoan thanh: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = { 5, 2, 9, 1, 6 };
        insertionSort(array);
    }
}
