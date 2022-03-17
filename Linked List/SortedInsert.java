class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SortedInsert {
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node insertInSorted(Node head, int key) {
        Node newNode = new Node(key);
        if (head == null) {
            return newNode;
        }
        if (head.data > key) {
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data <= key) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        print(head);
        head = insertInSorted(head, 12);
        print(head);
        head = insertInSorted(head, 5);
        print(head);
        head = insertInSorted(head, 49);
        print(head);
    }
}
