import java.util.ArrayList;

class MyStack {
    ArrayList<Integer> stack = new ArrayList<Integer>();

    void push(int data) {
        stack.add(data);
    }

    int peek() {
        if (stack.size() == 0) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        return stack.get(stack.size() - 1);
    }

    int pop() {
        if (stack.size() == 0) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        return stack.remove(stack.size() - 1);
    }

    int size() {
        return stack.size();
    }

    boolean isEmpty() {
        return stack.size() == 0 ? true : false;
    }

    void showStack() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
}

public class ArrayListStack {
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
    }
}
