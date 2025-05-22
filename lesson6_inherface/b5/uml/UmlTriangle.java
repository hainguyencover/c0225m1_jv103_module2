package lesson6_inherface.b5.uml;

public class UmlTriangle {
    public static void main(String[] args) {
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                          Triangle                    |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| - side1: double                                      |");
        System.out.println("| - side2: String                                      |");
        System.out.println("| - side3: String                                      |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| + Triangle()                                         |");
        System.out.println("| + Triangle(side1: double,side2: double,side3: double)|");
        System.out.println("| + getRadius(): double                                |");
        System.out.println("| + setRadius(radius: double): void                    |");
        System.out.println("| + getColor(): String                                 |");
        System.out.println("| + setColor(color: String): void                      |");
        System.out.println("| + getArea(): double                                  |");
        System.out.println("| + getPerimeter(): double                             |");
        System.out.println("| + toString(): String                                 |");
        System.out.println("+------------------------------------------------------+");
    }
}
