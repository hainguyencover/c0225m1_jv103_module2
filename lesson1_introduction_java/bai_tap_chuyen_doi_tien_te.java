public class bai_tap_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double usd, vnd;
        System.out.println("Nhập số tiền USD: ");
        usd = new java.util.Scanner(System.in).nextDouble();
        vnd = usd * 23000;
        System.out.printf("Số tiền VND tương ứng là: %.2f\n", vnd);
    }
}
