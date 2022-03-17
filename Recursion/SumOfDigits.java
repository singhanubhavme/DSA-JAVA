public class SumOfDigits {
    static int sum(int n, int s) {
        if (n == 0)
            return s;
        return sum(n / 10, s + (n % 10));
    }

    static int sum(int n) {
        if (n == 0)
            return 0;
        return sum(n / 10) + n % 10;
    }

    public static void main(String args[]) {
        int n = 873, s = 0;
        System.out.println(sum(n, s) + " " + sum(n));
    }

}
