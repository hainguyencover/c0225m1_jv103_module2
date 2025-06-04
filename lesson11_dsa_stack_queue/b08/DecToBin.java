package b08;

import java.util.Scanner;
import java.util.Stack;

public class DecToBin {
    public static String decToBin(int soThapPhan) {
        if (soThapPhan == 0) {
            return "0";
        }
        Stack<Integer> nganXep = new Stack<>();
        while (soThapPhan > 0) {
            int soDu = soThapPhan % 2;
            nganXep.push(soDu);
            soThapPhan = soThapPhan / 2;
        }
        String ketQua = "";
        while (!nganXep.isEmpty()) {
            ketQua += nganXep.pop();
        }
        return ketQua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thap phan: ");
        int decinal = sc.nextInt();
        String binary = decToBin(decinal);
        System.out.println("So nhi phan tuong ung: " + binary);
    }
}
