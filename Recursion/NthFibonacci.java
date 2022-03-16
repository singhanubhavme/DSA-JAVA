public class NthFibonacci {
    static int fibo(int n, int f, int s) {
        if (n == 1)
            return s;
        return fibo(n - 1, s, f + s);
    }

    static int fibo(int n) {
        if (n == 0 || n == 1)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.print(fibo(n, 0, 1) + " " + fibo(n));
    }

}
