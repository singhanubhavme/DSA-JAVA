// https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

import java.util.Arrays;

class Compute {

    public void rotate(int arr[], int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}

public class RotateArrayByOne {
    public static void main(String[] args) {
        int N = 8;
        int A[] = { 9, 8, 7, 6, 4, 2, 1, 3 };
        new Compute().rotate(A, N);
        System.out.println(Arrays.toString(A));

    }
}
