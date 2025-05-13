import java.util.Scanner;

public class thuc_hanh_tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("Nhập tên sinh viên bạn muốn tìm: ");
            name = sc.nextLine();
            boolean isExist = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(name)) {
                    System.out.println("Tên sinh viên " + name + " có trong danh sách tại vị trí " + (i + 1));
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Tên sinh viên " + name + " không có trong danh sách.");
            }else {
                break;
            }
        }
    }
}
