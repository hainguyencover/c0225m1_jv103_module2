package b08;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
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

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right = new Node(35);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);
        System.out.print("Duyet theo thu tu preOder: ");
        tree.preOrderTraversal();
    }
}
