import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        int month, year; // Khai báo biến month và year
        System.out.println("Chương trình kiểm tra số ngày trong tháng của năm");
        System.out.println("Nhập năm: ");
        year = new Scanner(System.in).nextInt();
        // Kiểm tra năm hợp lệ
        if (year < 0) {
            System.out.println("Năm không hợp lệ");
            return;
        }
        System.out.println("Nhập tháng: ");
        month = new Scanner(System.in).nextInt();
        // Kiểm tra tháng hợp lệ
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ");
            return;
        }
        // Kiểm tra năm nhuận
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Số ngày trong các tháng
        int daysInMonth;
        switch (month) {
            case 1: // Tháng 1
            case 3: // Tháng 3
            case 5: // Tháng 5
            case 7: // Tháng 7
            case 8: // Tháng 8
            case 10: // Tháng 10
            case 12: // Tháng 12
                daysInMonth = 31;
                break;
            case 4: // Tháng 4
            case 6: // Tháng 6
            case 9: // Tháng 9
            case 11: // Tháng 11
                daysInMonth = 30;
                break;
            case 2: // Tháng 2
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                daysInMonth = -1; // Không hợp lệ
        }

        if (daysInMonth != -1) {
            System.out.println("Số ngày trong tháng " + month + " năm " + year + " là: " + daysInMonth);
        } else {
            System.out.println("Tháng không hợp lệ");
        }
    }
}
