public class SquareRoot {
    static int sqrtBinarySearch(int n) {
        int start = 0, mid, end = n;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid < n / mid) {
                start = mid + 1;
            } else if (mid > n / mid) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 43, 65, 76, 11, 6, 64, 36, 121, 2 };
        for (int i : arr) {
            System.out.print(sqrtBinarySearch(i) + " ");
        }
    }
}
