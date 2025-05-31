package b4;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        System.out.println("=== Test MyLinkedList ===");

        // Test thêm phần tử
        System.out.println("\n1. Test thêm phần tử:");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("Sau khi thêm 10, 20, 30: ");
        list.printList();

        list.addFirst(5);
        System.out.print("Sau khi thêm 5 vào đầu: ");
        list.printList();

        list.addLast(40);
        System.out.print("Sau khi thêm 40 vào cuối: ");
        list.printList();

        list.add(2, 15);
        System.out.print("Sau khi thêm 15 vào vị trí 2: ");
        list.printList();

        // Test truy cập phần tử
        System.out.println("\n2. Test truy cập phần tử:");
        System.out.println("Phần tử tại vị trí 0: " + list.get(0));
        System.out.println("Phần tử đầu tiên: " + list.getFirst());
        System.out.println("Phần tử cuối cùng: " + list.getLast());
        System.out.println("Kích thước danh sách: " + list.size());

        // Test tìm kiếm
        System.out.println("\n3. Test tìm kiếm:");
        System.out.println("Danh sách có chứa 20? " + list.contains(20));
        System.out.println("Danh sách có chứa 100? " + list.contains(100));
        System.out.println("Vị trí của 20: " + list.indexOf(20));
        System.out.println("Vị trí của 100: " + list.indexOf(100));

        // Test xóa phần tử
        System.out.println("\n4. Test xóa phần tử:");
        System.out.print("Danh sách hiện tại: ");
        list.printList();

        System.out.println("Xóa phần tử tại vị trí 1: " + list.remove(1));
        System.out.print("Sau khi xóa: ");
        list.printList();

        System.out.println("Xóa phần tử 30: " + list.remove(Integer.valueOf(30)));
        System.out.print("Sau khi xóa: ");
        list.printList();

        // Test sao chép
        System.out.println("\n5. Test sao chép:");
        MyLinkedList<Integer> clonedList = list.clone();
        System.out.print("Danh sách gốc: ");
        list.printList();
        System.out.print("Danh sách sao chép: ");
        clonedList.printList();

        // Test clear
        System.out.println("\n6. Test xóa tất cả:");
        list.clear();
        System.out.print("Sau khi clear: ");
        list.printList();
        System.out.println("Danh sách có rỗng? " + list.isEmpty());

        // Test constructor với tham số
        System.out.println("\n7. Test constructor với tham số:");
        MyLinkedList<String> stringList = new MyLinkedList<>("Hello");
        stringList.add("World");
        stringList.add("Java");
        System.out.print("String list: ");
        stringList.printList();
    }
}
