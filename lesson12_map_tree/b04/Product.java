import java.text.DecimalFormat;

public class Product implements Comparable<Product> {
    private int ID;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int iD, String name, double price) {
        ID = iD;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###"); // định dạng có dấu phẩy
        return "Product [ID=" + ID + ", name=" + name + ", price=" + df.format(price) + "]";
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }

}
