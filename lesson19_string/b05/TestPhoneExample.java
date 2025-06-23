package b05;

public class TestPhoneExample {
    public static final String[] validPhone = new String[] { "(84)-(0978489648)" };
    public static final String[] invalidPhone = new String[] { " (a8)-(22222222)", "(84)-(22b22222)",
            "(84)-(9978489648)" };

    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        for (String phone : validPhone) {
            boolean isValid = phoneExample.validate(phone);
            System.out.println("Class is " + phone + " is valid: " + isValid);
        }
        for (String phone : invalidPhone) {
            boolean isValid = phoneExample.validate(phone);
            System.out.println("Class is " + phone + " is valid: " + isValid);
        }
    }
}
