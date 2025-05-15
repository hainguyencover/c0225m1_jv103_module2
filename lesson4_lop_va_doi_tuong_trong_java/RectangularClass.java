import java.util.Scanner;

public class RectangularClass {
    private double width;
    private double height;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the rectangle:");
        double height = sc.nextDouble();
        RectangularClass rectangle =new RectangularClass(width, height);
        System.out.println("Rectangle: " + rectangle.display());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        sc.close();
    }
    public RectangularClass() {}

    public RectangularClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Width: " + this.width + ", Height: " + this.height;
    }
}
