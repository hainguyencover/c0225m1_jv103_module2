import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("SP001", "Laptop Gaming ABC", 25000000.0, "Dell", "Màn hình 15.6 inch, RTX 4070"));
        products.add(new Product("SP002", "Điện Thoại XYZ", 15000000.0, "Samsung", "Màn hình AMOLED, Camera 108MP"));
        products.add(
                new Product("SP003", "Bàn Phím Cơ RK61", 950000.0, "RK Royal Kludge", "Switch Red, Hot-swappable"));
        products.add(new Product("SP004", "Chuột Không Dây Logitech", 600000.0, "Logitech",
                "Cảm biến quang học, Pin 6 tháng"));
        products.add(
                new Product("SP005", "Màn Hình Cong 27 inch", 7800000.0, "LG", "Tần số quét 144Hz, Độ phân giải QHD"));
        writeDataToFile("product.txt", products);
        List<Product> productDataFromFile = readDataFromFile("product.txt");
        for (Product product : productDataFromFile) {
            System.out.println(product);
        }
    }

}
