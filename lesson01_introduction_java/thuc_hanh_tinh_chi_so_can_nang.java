public class thuc_hanh_tinh_chi_so_can_nang {
    public static void main(String[] args) {
        double weight, height, bmi;
        System.out.println("Nhập cân nặng (kg): ");
        weight = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Nhập chiều cao (m): ");
        height = new java.util.Scanner(System.in).nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("Chỉ số BMI là: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
    }
}
