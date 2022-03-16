public class SumOfNatural {
    static int tailSum(int n) {
        if (n == 0 || n == 1)
            return n;
        return sum(n - 1) + sum(n - 2);
    }

    static int sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.print(sum(n));
    }

}
