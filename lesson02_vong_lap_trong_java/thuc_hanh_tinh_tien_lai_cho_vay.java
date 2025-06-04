import java.util.Scanner;

public class thuc_hanh_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        double so_tien_vay = 1.0;
        double ti_le_lai_suat = 1.0;
        int so_thang_cho_vay = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền vay: ");
        so_tien_vay = input.nextDouble();
        System.out.println("Nhập lãi suất hàng tháng: ");
        ti_le_lai_suat = input.nextDouble();
        System.out.println("Nhập số tháng vay: ");
        so_thang_cho_vay = input.nextInt();
        double so_tien_lai = 0;
        for (int i = 0; i < so_thang_cho_vay; i++) {
            so_tien_lai += so_tien_vay * (ti_le_lai_suat / 100) / 12 * so_thang_cho_vay;
        }
        System.out.println("Số tiền lãi là: " + so_tien_lai);

    }
}
