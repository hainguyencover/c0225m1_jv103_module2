public class thuc_hanh_tim_min_trong_mang_su_dung_method {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = findMin(array);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + array[index]);
    }

    private static int findMin(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
