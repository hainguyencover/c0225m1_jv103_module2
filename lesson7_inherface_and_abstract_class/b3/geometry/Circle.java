package b3.geometry;

import b3.resizeable.Resizeable;

public class Circle implements Resizeable {
    private double radius;

    public Circle() {
        this.radius = 1.0; // Default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent / 100;
    }

    @Override
    public String toString(){
        return "Circle{" +
                "radius=" + String.format("%.2f", radius) +
                ", area=" + String.format("%.2f", getArea()) +
                ", perimeter=" + String.format("%.2f", getPerimeter()) +
                '}';
    }
}
