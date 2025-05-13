import java.util.Scanner;

public class bai_tap_dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char character = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự '" + character + "' trong chuỗi \"" + str + "\" là: " + count);

    }
}
