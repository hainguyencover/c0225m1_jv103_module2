package b3.test;

import b3.geometry.Circle;
import b3.geometry.Rectangle;
import b3.geometry.Square;
import b3.resizeable.Resizeable;

import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
        Resizeable[] resizeable = new Resizeable[6];
        resizeable[0] = new Circle();
        resizeable[1] = new Circle(5);
        resizeable[2] = new Rectangle();
        resizeable[3] = new Rectangle(5, 10);
        resizeable[4] = new Square();
        resizeable[5] = new Square(4);

        Random random = new Random();

        for (Resizeable value : resizeable) {
            double percent = random.nextDouble() * 100; // Random percentage between 0 and 100
            System.out.println("Before resize: " + value);
            value.resize(percent);
            System.out.println("After resize by " + String.format("%.2f", percent) + "%: " + value);
            System.out.println();
        }
    }
}
