class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    Node f, r;

    MyQueue() {
        this.f = null;
        this.r = null;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (f == null && r == null) {
            f = newNode;
            r = newNode;
        } else {
            r.next = newNode;
            r = newNode;
        }
    }

    int dequeue() {
        if (f == r) {
            f = null;
            r = null;
            return Integer.MAX_VALUE;
        }
        int data = f.data;
        f = f.next;
        return data;
    }

    int size() {
        Node temp = f;
        int size = 0;
        while (f != null) {
            f = f.next;
            size++;
        }
        f = temp;
        return size;
    }

    int getRear() {
        return r != null ? r.data : Integer.MAX_VALUE;
    }

    int getFront() {
        return f != null ? f.data : Integer.MAX_VALUE;
    }

    boolean isEmpty() {
        return (f == null && r == null);
    }

    void displayQueue() {
        Node temp = f;
        while (f != null) {
            System.out.print(f.data + " ");
            f = f.next;
        }
        System.out.println();
        f = temp;
    }
}

public class LinkedListQueue {
    public static void main(String args[]) {
        MyQueue q = new MyQueue();
        System.out.println(q.isEmpty());
        q.enqueue(11);
        System.out.println(q.isEmpty());
        q.displayQueue();
        System.out.println(q.dequeue());
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.displayQueue();
        System.out.println(q.size());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.isEmpty());
        q.displayQueue();
    }
}
