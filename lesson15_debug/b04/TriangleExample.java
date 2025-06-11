import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap canh c: ");
        double c = scanner.nextDouble();
        TriangleExample triangleExample = new TriangleExample();
        triangleExample.triangle(a, b, c);
    }

    private void triangle(double a, double b, double c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("Canh cua tam giac phai lon hon 0");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Tong hai canh phai lon hon canh con lai");
            }
            System.out.println("Day la mot tam giac hop le.");
        } catch (IllegalArgumentException e) {
            System.err.println("Loi: " + e.getMessage());
        }
    }
}
