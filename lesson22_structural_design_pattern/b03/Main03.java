import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or folder path: ");
        String path = scanner.nextLine();
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        Client03 client = new Client03(fileCalculator);
        client.printFileSize(path);
    }
}
