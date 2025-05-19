public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Classes: " + classes);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setClasses("C03");
        student.display();
    }
}
