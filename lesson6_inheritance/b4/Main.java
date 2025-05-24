package lesson6_inherface.b4;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        System.out.println("Point p1 = " + p1.toString());
        p1.setXY(5, 7);
        System.out.println("After setXY(5,7), p1 = " + p1.toString());

        // Tạo đối tượng MovablePoint
        MoveablePoint mp1 = new MoveablePoint(1, 2, 0.5f, 1.5f);
        System.out.println("MovablePoint mp1 = " + mp1.toString());

        mp1.move();
        System.out.println("After move(), mp1 = " + mp1.toString());

        mp1.setSpeed(2.0f, 3.0f);
        System.out.println("After setSpeed(2.0, 3.0), mp1 = " + mp1.toString());

        mp1.move().move();  // Di chuyển hai lần
        System.out.println("After move().move(), mp1 = " + mp1.toString());
    }
}
