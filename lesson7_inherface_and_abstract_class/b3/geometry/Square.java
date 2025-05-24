package b3.geometry;

import b3.colorable.Colorable;
import b3.resizeable.Resizeable;
import jdk.jfr.Percentage;

public class Square implements Resizeable, Colorable {
    private double side;

    public Square() {
        this.side = 1.0; // Default side length
    }

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void resize(double percent) {
        side += side * percent / 100;
    }

    @Override
    public void howToColor(String color) {
        System.out.println("Color all four sides" + " with " + color + " color.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + String.format("%.2f", side) +
                ", area=" + String.format("%.2f", getArea()) +
                ", perimeter=" + String.format("%.2f", getPerimeter()) +
                '}';
    }


}
