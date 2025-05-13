public class bai_tap_tim_index_max_trong_mang_hai_chieu {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxIndex = findMaxIndex(arr);
        System.out.println("Index of the maximum element: " + maxIndex);
    }
    public static int findMaxIndex(int[][] arr) {
        int max = arr[0][0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    index = i * arr[i].length + j; // Calculate the index in a 1D representation
                }
            }
        }

        return index;
    }
}
