public class AccessModifier {
    private double radius = 1.0;

    public AccessModifier() {

    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AccessModifier circle = new AccessModifier();
        AccessModifier circle1 = new AccessModifier(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("----------------------------------");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
    }
}
