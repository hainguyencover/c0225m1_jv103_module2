public class thuc_hanh_giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        double a, b, c,x;
        System.out.println("Giải phương trình bậc nhất ax + b = c");
        System.out.print("Nhập a: ");
        a = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Nhập b: ");
        b = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Nhập c: ");
        c = new java.util.Scanner(System.in).nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            x = (c - b) / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
