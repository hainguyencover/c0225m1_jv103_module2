package b11;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Nguyen Van A", "Male", "1980-04-10"),
                new Person("Tran Thi B", "Female", "1981-08-15"),
                new Person("Le Van C", "Male", "1982-01-20"),
                new Person("Pham Thi D", "Female", "1983-11-05"),
                new Person("Hoang Van E", "Male", "1984-06-10")
        };

        // Tạo 2 queue: một cho nữ, một cho nam
        Queue<Person> queueFemale = new LinkedList<>();
        Queue<Person> queueMale = new LinkedList<>();

        // Phân loại nhân viên vào 2 queue theo giới tính
        for (Person e : persons) {
            if (e.gioiTinh.equalsIgnoreCase("Female")) {
                queueFemale.offer(e);
            } else {
                queueMale.offer(e);
            }
        }

        // Bắt đầu ghi kết quả (ở đây mình sẽ in ra console, bạn có thể thay thành ghi file)
        System.out.println("Danh sách nhân viên sau khi demerging:");

        // In nhân viên nữ trước
        while (!queueFemale.isEmpty()) {
            Person e = queueFemale.poll();
            System.out.println(e);
        }

        // Rồi tới nhân viên nam
        while (!queueMale.isEmpty()) {
            Person e = queueMale.poll();
            System.out.println(e);
        }
    }
}
