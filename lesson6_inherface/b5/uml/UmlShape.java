package lesson6_inherface.b5.uml;

public class UmlShape {
    public static void main(String[] args) {
        System.out.println("+------------------------------------------+");
        System.out.println("|                   Shape                  |");
        System.out.println("+------------------------------------------+");
        System.out.println("| - color: String                          |");
        System.out.println("| - filled: boolean                        |");
        System.out.println("+------------------------------------------+");
        System.out.println("| + Shape()                                |");
        System.out.println("| + Shape(color: String, filled: boolean)  |");
        System.out.println("| + isFilled(): double                     |");
        System.out.println("| + setFilled(filled: boolean): void       |");
        System.out.println("| + getColor(): String                     |");
        System.out.println("| + toString(): String                     |");
        System.out.println("+------------------------------------------+");
    }
}
