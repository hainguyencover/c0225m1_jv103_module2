package b04;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap duong dan tap tin nguon: ");
        String sourcePath = scanner.nextLine();

        System.out.println("Nhap duong dan tap tin dich: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra tệp nguồn
        if (!sourceFile.exists()) {
            System.out.println("Tap tin nguon khong ton tai.");
            return;
        }

        // Kiểm tra tệp đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("Tap tin đich đa ton tai. Vui long đoi ten hoac xoa truoc khi chay lai.");
            return;
        }

        // Thực hiện sao chép
        try (
                InputStream in = new FileInputStream(sourceFile);
                OutputStream out = new FileOutputStream(targetFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Da sao chep thanh cong " + totalBytes + " byte.");
        } catch (IOException e) {
            System.out.println("Da xay ra loi khi sao chep tap tin: " + e.getMessage());
        }
    }
}
