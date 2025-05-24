package lesson6_inherface.b2.uml;

public class UmlCylinder {
    public static void main(String[] args) {
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("|                         Cylinder                          |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| - height: double                                          |");
        System.out.println("+-----------------------------------------------------------+");
        System.out.println("| + Cylinder()                                              |");
        System.out.println("| + Cylinder(radius: double, color: String,height: double)  |");
        System.out.println("| + getHeight(): double                                     |");
        System.out.println("| + setHeight(height: double): void                         |");
        System.out.println("| + getVolume(): double                                     |");
        System.out.println("| + toString(): String                                      |");
        System.out.println("+-----------------------------------------------------------+");
    }
}
