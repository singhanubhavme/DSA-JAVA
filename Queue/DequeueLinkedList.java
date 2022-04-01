class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyDequeue {
    Node front, rear;

    MyDequeue() {
        this.front = this.rear = null;
    }

    void insertFront(int data) {
        Node newNode = new Node(data);
        if (this.front == null && this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            newNode.next = this.front;
            this.front = newNode;
        }
    }

    void insertRear(int data) {
        Node newNode = new Node(data);
        if (this.front == null && this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    void deleteFront() {
        if (this.front != null)
            this.front = this.front.next;
    }

    void deleteRear() {
        if (this.front == this.rear)
            this.front = this.rear = null;
        else {
            Node temp = front;
            while (this.front.next != this.rear) {
                this.front = this.front.next;
            }
            this.rear = this.front;
            this.front = temp;
        }
    }

    int getFront() {
        return this.front != null ? this.front.data : Integer.MAX_VALUE;
    }

    int getRear() {
        return this.rear != null ? this.rear.data : Integer.MIN_VALUE;
    }

    int size() {
        Node temp = this.front;
        int size = 0;
        while (this.front != null) {
            this.front = this.front.next;
            size++;
        }
        this.front = temp;
        return size;
    }

    void displayDequeue() {
        if (this.front == null) {
            System.out.println("Empty Dequeue");
            return;
        }
        Node temp = this.front;
        while (this.front != this.rear) {
            System.out.print(this.front.data + " ");
            this.front = this.front.next;
        }
        System.out.print(this.front.data + " ");
        System.out.println();
        this.front = temp;
    }
}

public class DequeueLinkedList {
    public static void main(String args[]) {
        MyDequeue q = new MyDequeue();
        System.out.println(q.size());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.deleteFront();
        q.deleteRear();
        q.insertFront(10);
        q.insertFront(11);
        q.insertRear(99);
        q.insertRear(98);
        q.displayDequeue();
        System.out.println(q.size());
        q.displayDequeue();
        q.deleteFront();
        q.displayDequeue();
        q.deleteRear();
        q.displayDequeue();
        q.deleteFront();
        q.displayDequeue();
        q.deleteRear();
        q.displayDequeue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}
