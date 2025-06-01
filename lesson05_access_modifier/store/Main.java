package store;

public class Main {
    public static void main(String[] args) {
        // Before creating any products
        System.out.println("Initial product count: " + Product.getTotalProducts());

        // Create products
        Product laptop = new Product("Laptop", 1000);
        Product phone = new Product("Smartphone", 500);
        Product tablet = new Product("Tablet", 300);

        // After creating products
        System.out.println("Current product count: " + Product.getTotalProducts());
        // Display product info
        System.out.println("\n--- Product Information ---");
        laptop.displayInfo();
        // Truy cập price thông qua getter
        System.out.println("\nLaptop price: " + laptop.getPrice());
        // Cập nhật price thông qua setter
        laptop.setPrice(1200);
        System.out.println("Laptop updated price: " + laptop.getPrice());
        // Thử cập nhật với giá trị không hợp lệ
        laptop.setPrice(-100); // Sẽ hiển thị thông báo lỗi
        System.out.println("Laptop price after invalid update: " + laptop.getPrice());

        // After creating products
        System.out.println("Current product count: " + Product.getTotalProducts());
        // Display product info
        System.out.println("\n--- Product Information ---");
        phone.displayInfo();
        // Truy cập price thông qua getter
        System.out.println("\nphone price: " + phone.getPrice());
        // Cập nhật price thông qua setter
        phone.setPrice(1200);
        System.out.println("phone updated price: " + phone.getPrice());
        // Thử cập nhật với giá trị không hợp lệ
        phone.setPrice(-100); // Sẽ hiển thị thông báo lỗi
        System.out.println("phone price after invalid update: " + phone.getPrice());

        // After creating products
        System.out.println("Current product count: " + Product.getTotalProducts());
        // Display product info
        System.out.println("\n--- Product Information ---");
        tablet.displayInfo();
        // Truy cập price thông qua getter
        System.out.println("\ntablet price: " + tablet.getPrice());
        // Cập nhật price thông qua setter
        tablet.setPrice(1200);
        System.out.println("tablet updated price: " + tablet.getPrice());
        // Thử cập nhật với giá trị không hợp lệ
        tablet.setPrice(-100); // Sẽ hiển thị thông báo lỗi
        System.out.println("tablet price after invalid update: " + tablet.getPrice());
    }
}