public class Client03 {
    private FileCalculator fileCalculator;

    public Client03(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path) {
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
