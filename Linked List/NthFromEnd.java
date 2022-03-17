class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class NthFromEnd {
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void nthNodeFromEnd(Node head, int n) { // using 2 refs
        if (n <= 0)
            return;
        Node first = head, second = head;
        while (n != 0) {
            n--;
            if (second == null)
                return;
            second = second.next;
        }
        while (second != null) {
            second = second.next;
            first = first.next;
        }
        System.out.println(first.data);
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);
        print(head);
        nthNodeFromEnd(head, 8);
    }
}