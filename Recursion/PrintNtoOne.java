public class PrintNtoOne {
    static void print(int n) {
        if (n <= 0)
            return;
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void main(String args[]) {
        int n = 43;
        print(n);
    }
}