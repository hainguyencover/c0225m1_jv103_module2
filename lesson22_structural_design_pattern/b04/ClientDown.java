import java.util.Scanner;

public class ClientDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter file URL to download:");
        String fileURL = scanner.nextLine();

        System.out.println("Enter destination file path:");
        String destinationPath = scanner.nextLine();

        Downloader downloader = new FileDownloaderProxy();
        downloader.download(fileURL, destinationPath);

        scanner.close();
    }
}
