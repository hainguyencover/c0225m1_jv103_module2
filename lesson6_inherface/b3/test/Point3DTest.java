package lesson6_inherface.b3.test;

import lesson6_inherface.b3.point.Point3D;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        System.out.println("Point3D mặc định: " + p1);

        Point3D p2 = new Point3D(1.2f, 3.4f, 5.6f);
        System.out.println("Point3D có tham số: " + p2);

        p2.setZ(9.9f);
        System.out.println("Sau khi setZ: z = " + p2.getZ());

        p2.setXYZ(7.7f, 8.8f, 9.9f);
        System.out.println("Sau khi setXYZ: " + p2);

        float[] coords = p2.getXYZ();
        System.out.println("Giá trị getXYZ(): x = " + coords[0] + ", y = " + coords[1] + ", z = " + coords[2]);
    }
}
