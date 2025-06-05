package b07;

public class BST {
    class Node {
        int element;
        Node left, right;

        Node(int e) {
            element = e;
            left = right = null;
        }
    }

    private Node root;

    // Chèn phần tử vào BST
    public void insert(int e) {
        root = insertRec(root, e);
    }

    private Node insertRec(Node root, int e) {
        if (root == null) {
            root = new Node(e);
            return root;
        }
        if (e < root.element)
            root.left = insertRec(root.left, e);
        else if (e > root.element)
            root.right = insertRec(root.right, e);
        return root;
    }

    // Xóa phần tử khỏi BST
    public boolean delete(int e) {
        Node[] nodes = findWithParent(e);
        Node current = nodes[0];
        Node parent = nodes[1];

        if (current == null)
            return false; // Không tìm thấy phần tử

        // Trường hợp 1: current không có con trái
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else if (parent.left == current) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        // Trường hợp 2: current có con trái
        else {
            Node parentOfRightMost = current;
            Node rightMost = current.left;

            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }

            current.element = rightMost.element;

            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                parentOfRightMost.left = rightMost.left;
            }
        }

        return true;
    }

    // Tìm node chứa phần tử e và node cha của nó
    private Node[] findWithParent(int e) {
        Node parent = null;
        Node current = root;

        while (current != null) {
            if (e == current.element)
                break;
            parent = current;
            if (e < current.element)
                current = current.left;
            else
                current = current.right;
        }
        return new Node[] { current, parent };
    }

    // In cây theo thứ tự tăng dần (in-order traversal)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.element + " ");
            inorderRec(root.right);
        }
    }

    // Main test
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(16);
        tree.insert(14);

        System.out.print("Cay truoc khi xoa: ");
        tree.inorder(); // In ra 10 14 16 20 30

        tree.delete(20);

        System.out.print("Cay sau khi xoa 20: ");
        tree.inorder(); // In ra 10 14 16 30
    }
}
