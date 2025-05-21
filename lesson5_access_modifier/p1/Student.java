package p1;
public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";

    Student(int r, String n) {
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
        Student.change();

        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Nam");
        Student s3 = new Student(333, "Hanh");
        s1.display();
        s2.display();
        s3.display();
    }
}
