package b3;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        // Thêm phần tử
        list.add("Hello");
        list.add("World");
        list.add(1, "Java");

        // In ra các phần tử
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at " + i + ": " + list.get(i));
        }

        // Kiểm tra contains và indexOf
        System.out.println("Contains 'World'? " + list.contains("World"));
        System.out.println("Index of 'Java': " + list.indexOf("Java"));

        // Xóa phần tử
        String removed = list.remove(1);
        System.out.println("Removed element: " + removed);

        // In ra sau khi xóa
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at " + i + ": " + list.get(i));
        }

        // Clear danh sách
        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}
