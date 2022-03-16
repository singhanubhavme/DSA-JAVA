public class Factorial {
    static int fact(int n, int k) { // tail recursive function
        if (n == 1 || n == 0)
            return k;
        return fact(n - 1, k * n);
    }

    static int fact(int n) { // not tail recursion, takes more time than tail recursive
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.print(fact(n) + " " + fact(n, 1));
    }
}
