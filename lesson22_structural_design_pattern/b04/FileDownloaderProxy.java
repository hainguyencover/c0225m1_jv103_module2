public class FileDownloaderProxy implements Downloader {
    private static final String FIREFOX_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0";
    private FileDownloader realDownloader;

    public FileDownloaderProxy() {
        realDownloader = new FileDownloader(FIREFOX_USER_AGENT);
    }

    @Override
    public void download(String fileURL, String destinationPath) {
        realDownloader.download(fileURL, destinationPath);
    }
}
