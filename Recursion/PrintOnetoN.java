public class PrintOnetoN {
    static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.print(n + " ");
    }

    static void tailprint(int x, int n) {
        if (x == n + 1)
            return;
        System.out.print(x + " ");
        tailprint(x + 1, n);
    }

    public static void main(String args[]) {
        int n = 14;
        print(n);
        System.out.println();
        tailprint(1, n);
    }
}