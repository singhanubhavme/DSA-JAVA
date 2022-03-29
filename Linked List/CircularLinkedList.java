class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class CircularLinkedList {
    static Node insertAtHead(Node head, int data) { // naive
        Node temp = head;
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        do {
            temp = temp.next;
        } while (temp.next != head);
        newNode.next = temp.next;
        temp.next = newNode;
        return newNode;
    }

    static Node insertAtHeadEfficient(Node head, int data) { // efficient
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = head.next;
        head.next = newNode;
        int tempVar = head.data;
        head.data = head.next.data;
        head.next.data = tempVar;
        return head;
    }

    static Node insertAtEnd(Node head, int data) { // naive
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        return head;
    }

    static Node insertAtEndEfficient(Node head, int data) { // efficient
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = head.next;
        head.next = newNode;
        int temp = head.next.data;
        head.next.data = head.data;
        head.data = temp;
        head = head.next;
        return head;
    }

    static Node deleteHead(Node head) { // naive
        if (head == null || head.next == head) {
            return null;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        return head.next;
    }

    static Node deleteHeadEfficient(Node head) { // efficient
        if (head == null || head.next == head) {
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    static int lengthOfList(Node head) {
        Node temp = head;
        int len = 1;
        while (temp.next != head) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    static Node deleteKthNode(Node head, int k) {
        if (head == null || head.next == head) {
            return null;
        }
        if (k <= 0 || k > lengthOfList(head))
            return head;
        Node temp = head;
        if (k == 1) {
            head = deleteHeadEfficient(head);
        } else {
            while (k != 2 && temp.next != head) {
                temp = temp.next;
                k--;
            }
            temp.next = temp.next.next;
        }
        return head;
    }

    static void print(Node head) {
        if (head == null)
            return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (head != temp);
        System.out.println();
    }

    public static void main(String args[]) {
        // Node head = null;
        Node head = new Node(10);
        // head.next = head;
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = head;
        print(head);
        // head = insertAtHead(head, 112);
        // head = insertAtHeadEfficient(head, 152);
        // head = insertAtEnd(head, 68);
        // head = insertAtEndEfficient(head, 612);
        // head=deleteHead(head);
        // head = deleteHeadEfficient(head);
        // print(head);
        // head = deleteKthNode(head, 1);
        // print(head);
        // head = deleteKthNode(head, 2);
        // print(head);
    }
}
