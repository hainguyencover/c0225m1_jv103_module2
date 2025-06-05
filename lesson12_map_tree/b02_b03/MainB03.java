import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainB03 {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 21, "HN");
        Student student3 = new Student("Hai", 22, "HN");
        Student student4 = new Student("Linh", 39, "HN");
        Student student5 = new Student("Long", 23, "HN");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        lists.add(student5);
        System.out.println("Danh sach sinh vien: ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi: ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
