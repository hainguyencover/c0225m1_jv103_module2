import java.util.Scanner;

public class bai_tap_ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        int number;
        System.out.println("Nhập số nguyên dương (tối đa 9 chữ số): ");
        number = new Scanner(System.in).nextInt();

        if (number < 0 || number > 999999999) {
            System.out.println("Số không hợp lệ.");
            return;
        }

        int billion = number / 1000000000;
        int million = (number % 1000000000) / 1000000;
        int thousand = (number % 1000000) / 1000;
        int hundred = number % 1000;

        StringBuilder result = new StringBuilder();

        if (billion > 0) {
            result.append(readThreeDigits(billion)).append(" tỷ ");
        }

        if (million > 0) {
            result.append(readThreeDigits(million)).append(" triệu ");
        }

        if (thousand > 0) {
            result.append(readThreeDigits(thousand)).append(" nghìn ");
        }

        if (hundred > 0 || number == 0) {
            result.append(readThreeDigits(hundred));
        }

        System.out.println("Kết quả đọc: " + result.toString().trim());
    }

    public static String readThreeDigits(int num) {
        StringBuilder sb = new StringBuilder();

        int tram = num / 100;
        int chuc = (num % 100) / 10;
        int donvi = num % 10;

        // Hàng trăm
        switch (tram) {
            case 1: sb.append("một trăm "); break;
            case 2: sb.append("hai trăm "); break;
            case 3: sb.append("ba trăm "); break;
            case 4: sb.append("bốn trăm "); break;
            case 5: sb.append("năm trăm "); break;
            case 6: sb.append("sáu trăm "); break;
            case 7: sb.append("bảy trăm "); break;
            case 8: sb.append("tám trăm "); break;
            case 9: sb.append("chín trăm "); break;
            default:
                if (num >= 100) sb.append("không trăm ");
                break;
        }

        // Hàng chục
        switch (chuc) {
            case 0:
                if (donvi != 0 && tram != 0) sb.append("lẻ ");
                break;
            case 1:
                sb.append("mười ");
                break;
            case 2:
                sb.append("hai mươi ");
                break;
            case 3:
                sb.append("ba mươi ");
                break;
            case 4:
                sb.append("bốn mươi ");
                break;
            case 5:
                sb.append("năm mươi ");
                break;
            case 6:
                sb.append("sáu mươi ");
                break;
            case 7:
                sb.append("bảy mươi ");
                break;
            case 8:
                sb.append("tám mươi ");
                break;
            case 9:
                sb.append("chín mươi ");
                break;
        }

        // Hàng đơn vị
        switch (donvi) {
            case 0:
                break;
            case 1:
                if (chuc >= 2) sb.append("mốt");
                else sb.append("một");
                break;
            case 5:
                if (chuc >= 1) sb.append("lăm");
                else sb.append("năm");
                break;
            case 2:
                sb.append("hai");
                break;
            case 3:
                sb.append("ba");
                break;
            case 4:
                sb.append("bốn");
                break;
            case 6:
                sb.append("sáu");
                break;
            case 7:
                sb.append("bảy");
                break;
            case 8:
                sb.append("tám");
                break;
            case 9:
                sb.append("chín");
                break;
        }

        return sb.toString().trim();
    }
}
