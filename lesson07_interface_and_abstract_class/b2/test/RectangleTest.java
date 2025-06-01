package b2.test;

import b2.geometry.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.5, 4.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(3.5, 4.5, "indigo", false);
        System.out.println(rectangle);

    }
}

