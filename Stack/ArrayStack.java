class MyStack {
    int top;
    int stack[];
    int size;

    MyStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[size];
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = data;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        return stack[top];
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        return stack[top--];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void showStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class ArrayStack {
    public static void main(String args[]) {
        MyStack s = new MyStack(10);
        s.push(11);
        s.showStack();
        s.push(22);
        s.push(33);
        s.showStack();
        System.out.println(s.pop());
        s.showStack();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.showStack();
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.pop();
        System.out.println(s.peek());
        
    }
}
