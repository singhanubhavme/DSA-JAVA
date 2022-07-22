import java.util.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BinaryTree {
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
        }
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.right), height(root.left)) + 1;
    }

    static void printAtK(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.key + " ");
        }
        printAtK(root.left, k - 1);
        printAtK(root.right, k - 1);
    }

    static void levelOrderTraversal(Node root) { // naive
        int h = height(root);
        for (int i = 0; i < h; i++) {
            printAtK(root, i);
        }
    }

    static void levelOrderTraversalQueue(Node root) { // pro
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            System.out.print(q.peek().key + " ");
            Node temp = q.poll();
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }

        }
    }

    static int sizeOfBT(Node root) {
        if (root == null)
            return 0;
        return sizeOfBT(root.left) + sizeOfBT(root.right) + 1;
    }

    static int maxInBT(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.key, Math.max(maxInBT(root.left), maxInBT(root.right)));
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(100);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        // inorder(root);
        // System.out.println();
        // preorder(root);
        // System.out.println();
        // postorder(root);
        // System.out.println();
        // System.out.println(height(root));
        // printAtK(root, 0);
        // levelOrderTraversal(root);
        // System.out.println();
        // levelOrderTraversalQueue(root);
        // System.out.println(sizeOfBT(root));
        // System.out.println(maxInBT(root));
    }
}
