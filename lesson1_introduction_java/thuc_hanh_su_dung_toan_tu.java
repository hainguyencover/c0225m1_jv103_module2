import java.util.Scanner;

public class thuc_hanh_su_dung_toan_tu {
    public static void main(String[] args) {
        float width, height;
        Scanner sc = new Scanner(System.in);//Khai báo đối tượng Scanner
        System.out.print("Enter width: ");
        width = sc.nextFloat();//Nhập chiều rộng
        System.out.print("Enter height: ");
        height = sc.nextFloat();//Nhập chiều cao
        float area = width * height;//Tính diện tích
        System.out.println("Area is: " + area);//In ra diện tích
    }
}
