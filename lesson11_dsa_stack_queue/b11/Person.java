package b11;

public class Person {
    String name;
    String gioiTinh;
    String ngaySinh;

    public Person(String name, String gioiTinh, String ngaySinh) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}
