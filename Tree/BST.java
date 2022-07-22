class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

public class BST {

    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else if (key == root.data) {
            return true;
        } else if (key > root.data) {
            return search(root.right, key);
        } else {
            return search(root.left, key);
        }
    }

    static Node insertRecursive(Node root, int key) {
        if (root == null)
            return new Node(key);
        if (root.data > key) {
            root.left = insertRecursive(root.left, key);
        } else {
            root.right = insertRecursive(root.right, key);
        }
        return root;
    }

    static Node insertIterative(Node root, int key) {
        Node newNode = new Node(key);
        Node parent = null, temp = root;
        while (temp != null) {
            parent = temp;
            if (temp.data > key) {
                temp = temp.left;
            } else if (temp.data < key) {
                temp = temp.right;
            } else {
                return root;
            }
        }
        if (parent == null)
            return newNode;
        if (parent.data > key) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.right = new Node(80);
        root.right.left = new Node(18);
        root.right.left.left = new Node(16);
        // System.out.println(search(root, 80));
        inorder(root);
        System.out.println();
        insertIterative(root, 100);
        // insertRecursive(root, 100);
        inorder(root);
        System.out.println();
        insertIterative(root, 12);
        // insertRecursive(root, 12);
        inorder(root);
        System.out.println();
    }
}
