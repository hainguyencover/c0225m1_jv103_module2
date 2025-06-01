package b3.geometry;

import b3.resizeable.Resizeable;

public class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0; // Default width
        this.height = 1.0; // Default height
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        height += height * percent / 100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + String.format("%.2f", width) +
                ", height=" + String.format("%.2f", height) +
                ", area=" + String.format("%.2f", getArea()) +
                ", perimeter=" + String.format("%.2f", getPerimeter()) +
                '}';
    }
}
