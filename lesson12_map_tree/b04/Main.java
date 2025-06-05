import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.addProduct(new Product(1, "Laptop Asus", 15000000));
        manager.addProduct(new Product(2, "Chuot Logitech", 500000));
        manager.addProduct(new Product(3, "Ban phim co", 1200000));
        manager.addProduct(new Product(4, "Man hinh Dell", 4500000));
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Them san pham");
            System.out.println("2. Sua san pham theo ID");
            System.out.println("3. Xoa san pham theo ID");
            System.out.println("4. Hien thi danh sach san pham");
            System.out.println("5. Tim kiem san pham theo ten");
            System.out.println("6. Sap xep san pham tang theo gia");
            System.out.println("7. Sap xep san pham giam theo gia");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhap ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();
                    System.out.print("Nhap gia: ");
                    double price = sc.nextDouble();
                    manager.addProduct(new Product(id, name, price));
                    break;
                case 2:
                    System.out.print("Nhap ID can sua: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ten moi: ");
                    String newName = sc.nextLine();
                    System.out.print("Gia moi: ");
                    double newPrice = sc.nextDouble();
                    manager.editProduct(updateId, newName, newPrice);
                    break;
                case 3:
                    System.out.print("Nhap ID can xoa: ");
                    int deleteId = sc.nextInt();
                    manager.deleteProductById(deleteId);
                    break;
                case 4:
                    manager.disPlayProduct();
                    break;
                case 5:
                    System.out.print("Nhap ten can tim: ");
                    String keyword = sc.nextLine();
                    manager.searchNameProduct(keyword);
                    break;
                case 6:
                    manager.sortByPrice(true);
                    System.out.println("Đa sap xep tang dan theo gia.");
                    break;
                case 7:
                    manager.sortByPrice(false);
                    System.out.println("Đa sap xep giam dan theo gia.");
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
