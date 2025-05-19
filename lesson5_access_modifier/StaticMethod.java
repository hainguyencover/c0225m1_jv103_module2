public class StaticMethod {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int r, String n) {
        rollNo = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod s1 = new StaticMethod(111, "Hoang");
        StaticMethod s2 = new StaticMethod(222, "Nam");
        StaticMethod s3 = new StaticMethod(333, "Hanh");
        s1.display();
        s2.display();
        s3.display();
    }
}
