import java.io.*;
import java.util.Scanner;

public class FileCopyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap duong dan tap tin nguon: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhap duong dan tap tin dich: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra sự tồn tại của file nguồn
        if (!sourceFile.exists()) {
            System.out.println("Tap tin nguon khong ton tai!");
            return;
        }

        // Kiểm tra nếu file đích đã tồn tại
        if (targetFile.exists()) {
            System.out.println("Tap tin đich đa ton tai");
            return;
        }

        try (
                InputStream inputStream = new FileInputStream(sourceFile);
                OutputStream outputStream = new FileOutputStream(targetFile)) {
            int byteCount = 0;
            int byteData;

            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
                byteCount++;
            }

            System.out.println(" Da sao chep " + byteCount + " byte tu tap tin nguon sang tap tin dich.");
        } catch (IOException e) {
            System.out.println("Loi khi sao chep tep: " + e.getMessage());
        }
    }
}
