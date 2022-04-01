class MyQueue {
    int arr[];
    int f, r;
    int size;

    MyQueue(int size) {
        this.size = size;
        arr = new int[size];
        f = r = -1;
    }

    void enqueue(int data) {
        if (f == -1 && r == -1) {
            r++;
            f++;
            arr[f] = data;
        } else {
            if (r == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            r++;
            arr[r] = data;
        }
    }

    int dequeue() {
        if (f == size - 1) {
            System.out.println("Queue Underflow");
            return Integer.MAX_VALUE;
        }
        return arr[f++];
    }

    int size() {
        return (r - f);
    }

    int getFront() {
        return arr[f];
    }

    int getRear() {
        return arr[r];
    }

    boolean isFull() {
        return r == (size - 1);
    }

    boolean isEmpty() {
        return (f == -1 && r == -1);
    }

    void displayQueue() {
        for (int i = f; i <= r && (f >= 0 && r < size); i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayQueue {
    public static void main(String args[]) {
        MyQueue q = new MyQueue(10);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(13);
        q.enqueue(13);
        q.enqueue(13);
        q.enqueue(13);
        q.enqueue(13);
        q.enqueue(13);
        q.enqueue(13);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println(q.isFull());
        q.displayQueue();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.displayQueue();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
