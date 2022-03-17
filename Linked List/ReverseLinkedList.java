import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class ReverseLinkedList {

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static Node reverse(Node head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.data);
            head = head.next;
        }
        Node temp = null;
        for (int i = list.size() - 1; i >= 0; i--) {
            Node newNode = new Node(list.get(i));
            if (i == list.size() - 1) {
                head = new Node(list.get(list.size() - 1));
                temp = head;
            } else {
                head.next = newNode;
                head = head.next;
            }
        }
        return temp;
    }

    static Node recursiveReverse(Node head){
        return head;
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
        head = reverse(head);
        print(head);
    }
}