package lesson6_inherface.b3.test;

import lesson6_inherface.b3.point.Point2D;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        System.out.println("Point mặc định: " + p1);

        Point2D p2 = new Point2D(3.5f, 7.2f);
        System.out.println("Point có tọa độ cụ thể: " + p2);

        p2.setX(5.0f);
        p2.setY(9.0f);
        System.out.println("Sau khi setX và setY: " + p2);

        p2.setXY(1.1f, 2.2f);
        System.out.println("Sau khi setXY: " + p2);

        float[] coords = p2.getXY();
        System.out.println("Giá trị getXY(): x = " + coords[0] + ", y = " + coords[1]);

    }
}
