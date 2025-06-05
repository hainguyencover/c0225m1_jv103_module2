import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void editProduct(int id, String newName, double price) {
        for (Product p : products) {
            if (p.getID() == id) {
                p.setName(newName);
                p.setPrice(price);
                return;
            }
        }
        System.out.println("Khong tim thay san voi ID: " + id);
    }

    public void deleteProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getID() == id) {
                products.remove(i); // xoá bằng chỉ số
                System.out.println("Đã xoá sản phẩm có ID: " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với ID: " + id);
    }

    public void disPlayProduct() {
        if (products.isEmpty()) {
            System.out.println("Danh sach san pham rong");
            return;
        }
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    public void searchNameProduct(String keyWord) {
        boolean found = false;
        for (Product pro : products) {
            if (pro.getName().toLowerCase().contains(keyWord.toLowerCase())) {
                System.out.println(pro.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay san pham!");
        }
    }

    public void sortByPrice(boolean ascending) {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        if (!ascending) {
            Collections.reverse(products);
        }
    }
}
