package lesson6_inherface.b2.test;

import lesson6_inherface.b2.geometry.Cylinder;

public class CylinderText {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(3.0, "green", 5.0);

        System.out.println("Cylinder 1: " + cy1);
        System.out.println("Cylinder 2: " + cy2);
    }
}
