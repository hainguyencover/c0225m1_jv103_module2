public class thuc_hanh_kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        int year;
        System.out.println("Nhập năm: ");
        year = new java.util.Scanner(System.in).nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " là năm nhuận.");
        } else {
            System.out.println(year + " không phải là năm nhuận.");
        }
    }
}
