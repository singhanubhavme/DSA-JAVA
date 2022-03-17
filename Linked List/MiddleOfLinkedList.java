class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MiddleOfLinkedList {
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static int naiveMiddle(Node head) { // naive
        int len = 0;
        if (head.next == null)
            return head.data;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        Node temp1 = head;
        len /= 2;
        while (len != 0) {
            len--;
            temp1 = temp1.next;
        }
        return temp1.data;
    }

    static int efficientMiddle(Node head) { // efficient
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
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
        // System.out.print(naiveMiddle(head));
        System.out.print(efficientMiddle(head));

    }
}
