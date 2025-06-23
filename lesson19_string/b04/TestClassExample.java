package b04;

public class TestClassExample {
    public static final String[] validClass = new String[] { "C0223G", "A0323K" };
    public static final String[] invalidClass = new String[] { "M0318G", "P0323A" };

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        for (String classs : validClass) {
            boolean isValid = classExample.validate(classs);
            System.out.println("Class is " + classs + " is valid: " + isValid);
        }
        for (String classs : invalidClass) {
            boolean isValid = classExample.validate(classs);
            System.out.println("Class is " + classs + " is valid: " + isValid);
        }
    }
}
