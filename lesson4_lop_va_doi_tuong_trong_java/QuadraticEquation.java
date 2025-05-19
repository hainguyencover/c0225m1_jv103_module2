import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter the value of a:");
            double a = sc.nextDouble();
            System.out.println("Enter the value of b:");
            double b = sc.nextDouble();
            System.out.println("Enter the value of c:");
            double c = sc.nextDouble();
            QuadraticEquation equation = new QuadraticEquation(a, b, c);
            System.out.println("Quadratic Equation: " + equation.display());
            double discriminant = equation.getDiscriminant();
            System.out.println("Discriminant: " + discriminant);
            if(discriminant > 0) {
                System.out.println("Root 1: " + equation.getRoot1());
                System.out.println("Root 2: " + equation.getRoot2());
            } else if(discriminant == 0) {
                System.out.println("Root: " + equation.getRoot1());
            } else {
                System.out.println("The equation has no real roots.");
            }
            System.out.println("Do you want to continue? (yes/no)");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
    public QuadraticEquation(){}
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return (b * b) - (4 * a * c);
    }
    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
    public String display() {
        return "Enter a: " + a + ",\t Enter b: " + b + ",\t Enter c: " + c;
    }
}
