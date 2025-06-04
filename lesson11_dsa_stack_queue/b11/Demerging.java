package b11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        String inputFile = "b11/input.txt"; // Giả sử file chứa dữ liệu
        String outputFile = "b11/output.txt"; // File lưu kết quả

        Queue<Person> nuQueue = new LinkedList<>();
        Queue<Person> namQueue = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            // Đọc từng dòng trong file
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 3)
                    continue; // Bỏ qua dòng lỗi

                Person p = new Person(parts[0].trim(), parts[1].trim(), parts[2].trim());

                if (p.gioiTinh.equalsIgnoreCase("Nu")) {
                    nuQueue.add(p);
                } else {
                    namQueue.add(p);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Ghi kết quả ra file mới
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            while (!nuQueue.isEmpty()) {
                bw.write(nuQueue.poll().toString());
                bw.newLine();
            }

            while (!namQueue.isEmpty()) {
                bw.write(namQueue.poll().toString());
                bw.newLine();
            }

            System.out.println("Xuat file thanh ccng: " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
