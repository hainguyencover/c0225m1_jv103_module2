import java.util.Scanner;

public class thuc_hanh_chuong_trinh_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Chương trình chuyển đổi nhiệt độ");
            System.out.println("1. Fahrenheit sang Celsius");
            System.out.println("2. Celsius sang Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhập nhiệt độ Fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit sang Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Nhập nhiệt độ Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius sang Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static double fahrenheitToCelsius(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    private static double celsiusToFahrenheit(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
