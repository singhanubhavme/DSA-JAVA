class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void recursivePrint(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        recursivePrint(head.next);
    }

    static int search(Node head, int key) {
        int pos = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return pos;
            pos++;
            temp = temp.next;
        }
        return -1;
    }

    static int searchRecursive(Node head, int key, int pos) {
        if (head == null)
            return -1;
        if (head.data == key)
            return pos;
        return searchRecursive(head.next, key, pos + 1);
    }

    static int searchRecursive(Node head, int key) {
        if (head == null)
            return -1;
        if (head.data == key)
            return 1;
        else {
            int pos = searchRecursive(head.next, key);
            if (pos == -1)
                return -1;
            return (pos + 1);
        }
    }

    static Node insertAtStart(Node head, int n) {
        Node newNode = new Node(n);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node insertAtEnd(Node head, int n) {
        Node newNode = new Node(n);
        Node temp = head;
        if (head == null) {
            return newNode;
        }
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
        head = temp;
        return head;
    }

    static Node deleteFromStart(Node head) {
        if (head == null)
            return null;
        return head.next;
    }

    static Node deleteFromEnd(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        return temp;
    }

    static Node insertAtPosition(Node head, int pos, int data) {
        if (pos == 0)
            return insertAtStart(head, data);
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos && head.next != null; i++) {
            head = head.next;
        }
        newNode.next = head.next;
        head.next = newNode;
        return temp;
    }

    static Node deleteFromPosition(Node head, int pos) {
        if(pos == 0) return deleteFromStart(head);
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        for (int i = 1; i < pos && head.next != null; i++) {
            head = head.next;
        }
        head.next = head.next.next;
        return temp;
    }

    public static void main(String args[]) {
        // Node head = null;
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        print(head);
        // recursivePrint(head);
        // System.out.print(search(head, 40) + " ");
        // System.out.print(searchRecursive(head, 40) + " ");
        // System.out.print(searchRecursive(head, 40, 0) + " ");
        // head = insertAtStart(head, 15);
        // print(head);
        // head = insertAtEnd(head, 15);
        // print(head);
        // head = insertAtEnd(head, -12);
        // print(head);
        // head = deleteFromStart(head);
        // print(head);
        // head = deleteFromStart(head);
        // print(head);
        // head = deleteFromEnd(head);
        // print(head);
        // head = deleteFromEnd(head);
        // print(head);
        // head = insertAtPosition(head, 1, 12);
        // print(head);
        // head = insertAtPosition(head, 3, -5);
        // print(head);
        // head = deleteFromPosition(head, 1);
        // print(head);
        // head = deleteFromPosition(head, 3);
        // print(head);

    }
}