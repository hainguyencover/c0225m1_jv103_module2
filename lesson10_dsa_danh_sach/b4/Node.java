package b4;

class Node<E> {
    E data;
    Node<E> next;

    // Constructor
    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    // Getter cho data
    public E getData() {
        return data;
    }
}
