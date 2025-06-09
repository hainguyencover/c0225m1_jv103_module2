import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value);
        } else {
            return binarySearch(array, left, middle - 1, value);
        }
    }

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so luong phan tu trong mang: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("So luong phan tu khong duoc vuot qua 20. Vui long nhap lai.");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Mang vua nhap: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        for (int j = 0; j < array.length; j++) {
            for (int z = 0; z < array.length; z++) {
                if (array[j] < array[z]) {
                    int temp = array[j];
                    array[j] = array[z];
                    array[z] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Mang sap xep tu be den lon: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.print("Nhap gia tri can tim: ");
        int value = sc.nextInt();
        int index = binarySearch(array, 0, array.length - 1, value);
        if (index != -1) {
            System.out.println("Tim thay " + value + " o vi tri index = " + index);
        } else {
            System.out.println("Khong tim thay " + value + " trong mang");
        }
    }

}
