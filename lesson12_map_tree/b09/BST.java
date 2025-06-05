package b09;

public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public boolean search(int element) {
        Node current = root;

        while (current != null) {
            if (element < current.data) {
                current = current.left;
            } else if (element > current.data) {
                current = current.right;
            } else
                return true;
        }
        return false;
    }

    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void preOrderTraversal() {
        preOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.right = new Node(35);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);
        System.out.print("Duyet theo thu tu preOder: ");
        tree.preOrderTraversal();
        System.out.println("Tim kiem phan tu co trong cay khong: " + tree.search(12));

    }
}
