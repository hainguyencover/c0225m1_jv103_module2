import java.util.Scanner;

public class bai_tap_hien_thi_20_so_nguyen_dau_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số lượng số nguyên tố cần in
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        int numbers = scanner.nextInt();

        // Bước 2: Khai báo biến đếm
        int count = 0;

        // Bước 3: Bắt đầu kiểm tra từ số 2
        int N = 2;

        System.out.println(numbers + " số nguyên tố đầu tiên là:");

        // Bước 4: Lặp cho đến khi in đủ số lượng yêu cầu
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

        scanner.close();
    }
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
