package store;

public class Product {
    private static int totalProducts = 0;

    private int id;
    private String name;
    private double price;
    private static final double VAT = 0.1;

    static {
        System.out.println("Product class is being initialized");
        if (totalProducts == 0) {
            System.out.println("No products have been created yet.");
        }
    }

    public Product(String name, double price) {
        this.id = ++totalProducts;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be navigative");

        }
    }

    public double getPriceWithVAT() {
        return this.price * (1 + VAT);
    }
    public static int getTotalProducts() {
        return totalProducts;
    }

    public static void printProducts() {
        System.out.println("Total products: " + totalProducts);
    }

    public void displayInfo() {
        System.out.println("Product ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Price with VAT: " + this.getPriceWithVAT());
        System.out.println("Total Products in inventory: " + Product.getTotalProducts());
    }
}
