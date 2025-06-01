import java.util.Arrays;

public class bai_tap_gop_mang {
    public static void main(String[] args) {
        int[] array1 = {1,2,4,5,6,6};
        int[] array2 = {3,4,5,6,7,8};
        System.out.println("Array 1: "+ Arrays.toString(array1));
        System.out.println("Array 2: "+ Arrays.toString(array2));
        int[] array3 = new int[array1.length+array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[index] = array1[i];
            index++;
        }
        for (int i = 0; i < array2.length; i++) {
            array3[index] = array2[i];
            index++;
        }
        // In mảng đã nhập
        System.out.print("Array 3: ");
        for (int value : array3) {
            System.out.print(value + " ");
        }
    }
}
