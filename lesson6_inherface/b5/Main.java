package lesson6_inherface.b5;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape.setColor("red");
        shape.setFilled(false);
        System.out.println(shape);

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);

        triangle.setColor("blue");
        triangle.setFilled(true);
        System.out.println(triangle);

    }
}
