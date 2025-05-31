package b4;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;

    // Constructor mặc định
    public MyLinkedList() {
        this.head = null;
        this.numNodes = 0;
    }

    // Constructor với một tham số để khởi tạo node đầu tiên
    public MyLinkedList(E element) {
        this.head = new Node<>(element);
        this.numNodes = 1;
    }

    // Phương thức thêm phần tử vào vị trí index
    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (index == 0) {
            addFirst(element);
        } else {
            Node<E> newNode = new Node<>(element);
            Node<E> current = head;

            // Tìm node tại vị trí index-1
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
            numNodes++;
        }
    }

    // Phương thức thêm phần tử vào cuối danh sách
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    // Phương thức thêm phần tử vào đầu danh sách
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    // Phương thức thêm phần tử vào cuối danh sách
    public void addLast(E element) {
        if (head == null) {
            addFirst(element);
        } else {
            Node<E> newNode = new Node<>(element);
            Node current = head;

            // Tìm node cuối cùng
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            numNodes++;
        }
    }

    // Phương thức xóa phần tử tại vị trí index
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (index == 0) {
            E data = head.data;
            head = head.next;
            numNodes--;
            return data;
        }

        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        E data = current.next.data;
        current.next = current.next.next;
        numNodes--;
        return data;
    }

    // Phương thức xóa phần tử cho trước
    public boolean remove(Object o) {
        if (head == null) {
            return false;
        }

        // Nếu phần tử cần xóa là node đầu tiên
        if ((o == null && head.data == null) || (o != null && o.equals(head.data))) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null) {
            if ((o == null && current.next.data == null) ||
                    (o != null && o.equals(current.next.data))) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // Phương thức truy cập phần tử tại vị trí index
    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Phương thức lấy phần tử đầu tiên
    public E getFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        return head.data;
    }

    // Phương thức lấy phần tử cuối cùng
    public E getLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    // Phương thức trả về số lượng phần tử
    public int size() {
        return numNodes;
    }

    // Phương thức kiểm tra danh sách có rỗng không
    public boolean isEmpty() {
        return numNodes == 0;
    }

    // Phương thức xóa tất cả phần tử
    public void clear() {
        head = null;
        numNodes = 0;
    }

    // Phương thức kiểm tra phần tử có tồn tại trong danh sách không
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    // Phương thức trả về vị trí của phần tử trong danh sách
    public int indexOf(Object o) {
        Node<E> current = head;
        int index = 0;

        while (current != null) {
            if ((o == null && current.data == null) ||
                    (o != null && o.equals(current.data))) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1; // Không tìm thấy
    }

    // Phương thức sao chép danh sách
    @SuppressWarnings("unchecked")
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();

        Node<E> current = head;
        while (current != null) {
            clonedList.addLast(current.data);
            current = current.next;
        }

        return clonedList;
    }

    // Phương thức đảm bảo dung lượng tối thiểu (không cần thiết cho LinkedList nhưng theo UML)
    public void ensureCapacity(int minCapacity) {
        // LinkedList không cần capacity, phương thức này để tương thích với UML
        // Có thể để trống hoặc throw UnsupportedOperationException
    }

    // Phương thức in danh sách
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<E> current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    // Override toString method
    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
