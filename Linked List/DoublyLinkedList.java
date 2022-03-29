class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DoublyLinkedList {
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        head.prev = newNode;
        newNode.next = head;
        return newNode;
    }

    static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
        newNode.prev = head;
        return temp;
    }

    static Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = head, prev = null;
        while (temp != null) {
            prev = temp.prev;
            temp.prev = temp.next;
            temp.next = prev;
            temp = temp.prev;
        }
        return prev.prev;
    }

    static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        head = head.next;
        head.prev = null;
        return head;
    }

    static Node deleteLastNode(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
        return head;
    }

    public static void main(String args[]) {
        // Node head = null;
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next = temp2;
        temp1.prev = head;
        temp2.prev = temp1;
        temp2.next = temp3;
        temp3.prev = temp2;
        print(head);
        // head = insertAtHead(head, 11);
        // print(head);
        // head = insertAtHead(head, 22);
        // print(head);
        // head = insertAtEnd(head, 11);
        // print(head);
        // head = insertAtEnd(head, 22);
        // head = reverseList(head);
        // print(head);
        // head = deleteHead(head);
        // print(head);
        // head = deleteLastNode(head);
        // print(head);
    }
}
