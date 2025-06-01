package b5;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        boolean isChiaHetCho3 = number % 3 == 0 ;
        boolean isChiaHetCho5 = number % 5 == 0;
        if (number < 0 || number > 100) {
            throw new IllegalArgumentException("Number must be between 0 and 100");
        }
        if (isChiaHetCho3 && isChiaHetCho5) return "FizzBuzz";
        if (isChiaHetCho3) return "Fizz";
        if (isChiaHetCho5) return "Buzz";

        return convertToVietnamese(number);
    }

    private static String convertToVietnamese(int number) {
        String[] chuSo = {
                "khong", "mot", "hai", "ba", "bon",
                "nam", "sau", "bay", "tam", "chin"
        };

        if (number < 10) {
            return chuSo[number]; // Đọc số 1 chữ số
        }

        int hangChuc = number / 10;  // Lấy hàng chục
        int hangDonVi = number % 10; // Lấy hàng đơn vị
        String ketQua = "";

        // Xử lý hàng chục
        if (hangChuc == 1) {
            ketQua = "muoi";
        } else {
            ketQua = chuSo[hangChuc] + " muoi";
        }

        // Xử lý hàng đơn vị
        if (hangDonVi == 0) {
            return ketQua; // Nếu là tròn chục, không cần thêm đơn vị
        }

        if (hangDonVi == 1 && hangChuc > 1) {
            ketQua += " mot"; // ví dụ: 21 → "hai mươi mốt"
        } else if (hangDonVi == 5 && hangChuc >= 1) {
            ketQua += " lam"; // ví dụ: 25 → "hai mươi lăm"
        } else {
            ketQua += " " + chuSo[hangDonVi];
        }

        return ketQua;
    }
}
