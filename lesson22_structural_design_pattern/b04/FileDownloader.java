import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String fileURL, String destinationPath) {
        try {
            URL url = new URL(fileURL);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent", userAgent);

            InputStream inputStream = connection.getInputStream();
            FileOutputStream outputStream = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[4096];
            int bytesRead;
            System.out.println("Downloading...");

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Download complete!");

            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            System.err.println("Download failed: " + e.getMessage());
        }
    }

}
