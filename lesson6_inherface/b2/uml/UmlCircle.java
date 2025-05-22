package lesson6_inherface.b2.uml;

public class UmlCircle {
    public static void main(String[] args) {
        System.out.println("+------------------------------------------+");
        System.out.println("|                  Circle                  |");
        System.out.println("+------------------------------------------+");
        System.out.println("| - radius: double                         |");
        System.out.println("| - color: String                          |");
        System.out.println("+------------------------------------------+");
        System.out.println("| + Circle()                               |");
        System.out.println("| + Circle(radius: double, color: String)  |");
        System.out.println("| + getRadius(): double                    |");
        System.out.println("| + setRadius(radius: double): void        |");
        System.out.println("| + getColor(): String                     |");
        System.out.println("| + setColor(color: String): void          |");
        System.out.println("| + getArea(): double                      |");
        System.out.println("| + toString(): String                     |");
        System.out.println("+------------------------------------------+");
    }
}
