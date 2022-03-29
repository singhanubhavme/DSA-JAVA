class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class MyStack {
    Node head;
    int size;

    MyStack() {
        head = null;
        size = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    int peek() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return (head == null);
    }

    void showStack() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListStack {
    public static void main(String args[]) {
        MyStack s = new MyStack();
        s.push(11);
        s.showStack();
        s.push(22);
        s.push(33);
        s.showStack();
        System.out.println(s.size());
        System.out.println(s.pop());
        s.showStack();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.showStack();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.showStack();
        s.pop();
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}
