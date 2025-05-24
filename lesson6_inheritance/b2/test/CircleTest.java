package lesson6_inherface.b2.test;

import lesson6_inherface.b2.geometry.Circle;
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5, "blue");

        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);
    }
}
